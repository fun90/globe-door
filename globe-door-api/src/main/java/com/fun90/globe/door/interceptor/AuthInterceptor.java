package com.fun90.globe.door.interceptor;

import com.fun90.globe.door.cache.UserCache;
import com.fun90.globe.door.model.Result;
import com.fun90.globe.door.model.vo.UserVO;
import com.fun90.globe.door.util.JacksonUtil;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {
	private static final String COOKIE_NAME = "auth";
	@Autowired
    private UserCache userCache;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean result = check(request, response, handler);
		String methodName = "";
		if (handler instanceof HandlerMethod handler1) {
			methodName = handler1.getMethod().getName();
		}
		log.info("{}, methodName:{}, auth result:{}, request contentType:{}, response contentType: {}", request.getRequestURI(), methodName, result, request.getContentType(), response.getContentType());
		return result;
	}

	private boolean check(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		if (handler == null) return true;
		PreAuth preAuth = verifyAuth(handler);
		//无需要认证
		if (preAuth == null) return true;
		String token = getAuthCookie(request);
		UserVO userCache = this.userCache.getCache(token);
		//重新登录
		if (token == null || userCache == null) {
			Result<Object> result = new Result<>(403, "请重新登录", null);
			response.setContentType("application/json;charset=UTF-8");
			response.getOutputStream().write(JacksonUtil.toJsonBytes(result));
			response.flushBuffer();
			return false;
		}

		String role = userCache.getRole();
		//超级管理员
		if (role.equals("admin")) return true;

		String[] roles = preAuth.value();
		for (String need : roles) {
			if (role.equals(need)) {
				return true;
			}

		}
		//其他
		Result<Object> result = new Result<>(403, "无权限", null);
		response.setContentType("application/json;charset=UTF-8");
		response.getOutputStream().write(JacksonUtil.toJsonBytes(result));
		response.flushBuffer();
		return false;
	}

	private PreAuth verifyAuth(Object handler) {
		PreAuth permit = null;
		if (handler instanceof HandlerMethod) {
			permit = ((HandlerMethod) handler).getMethod().getAnnotation(PreAuth.class);
			if (permit == null) {
				permit = ((HandlerMethod) handler).getBeanType().getAnnotation(PreAuth.class);
			}
		}
		return permit;
	}

	public String getAuthCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies == null) return null;
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals(COOKIE_NAME)) {
				return cookie.getValue();
			}
		}
		return null;
	}
}
