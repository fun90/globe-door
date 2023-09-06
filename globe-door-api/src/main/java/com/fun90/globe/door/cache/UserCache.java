package com.fun90.globe.door.cache;

import com.fun90.globe.door.model.vo.UserVO;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class UserCache {
	Cache<String, Integer> cacheManager = Caffeine.newBuilder().maximumSize(100).expireAfterWrite(6, TimeUnit.HOURS).build();
	//expireAfterAccess
	Cache<Integer, UserVO> userCacheManager = Caffeine.newBuilder().maximumSize(100).expireAfterAccess(6, TimeUnit.HOURS).build();

	public UserVO getCache(String key) {
		if (key == null) return null;
		Integer id = cacheManager.getIfPresent(key);
		if (id != null) return userCacheManager.getIfPresent(id);
		return null;
	}

	public void setCache(String key, UserVO value) {
		Integer id = value.getId();
		cacheManager.put(key, id);
		userCacheManager.put(id, value);
	}

	public void rmCache(String key) {
		cacheManager.invalidate(key);
	}
}
