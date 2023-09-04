package com.fun90.globe.door.controller;

//import com.fun90.admin.VO.AccountVO;
//import com.fun90.admin.VO.UserVO;
//import com.fun90.admin.cache.UserCache;
//import com.fun90.admin.constant.KVConstant;
//import com.fun90.admin.interceptor.PreAuth;
//import com.fun90.admin.model.Account;
//import com.fun90.admin.model.Server;
//import com.fun90.admin.repository.ServerRepository;
//import com.fun90.admin.service.AccountService;
//import com.fun90.admin.service.ServerService;
//import com.fun90.admin.util.Result;
//import com.fun90.admin.util.Validator;
import com.fun90.globe.door.model.Result;
import com.fun90.globe.door.model.vo.ServerVO;
import com.fun90.globe.door.service.base.ServerService;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class ServerController {
	@Autowired
	private ServerService serverService;

//	@PreAuth("vip")
	@ResponseBody
	@GetMapping("/server/{id}")
	public Result<ServerVO> get(@PathVariable @NotNull(message = "id can not null") Integer id) {
		ServerVO serverVO = serverService.findById(id);
		return new Result<>(Result.CODE_SUCCESS, null, serverVO);
	}

//	@PreAuth("admin")
//	@ResponseBody
//	@GetMapping("/server")
//	public Result findByPage(@NotNull(message = "page can not null") Integer page,
//							 @NotNull(message = "pageSize can not null") Integer pageSize,
//							 @CookieValue(KVConstant.COOKIE_NAME) String auth) {
//		Page<Server> all = serverRepository.findAll(Example.of(Server.builder().build()), PageRequest.of(page - 1, pageSize));
//
//		all.getContent().forEach(server -> {
//			VOList.add(server.toVO(ServerVO.class));
//		});
//		return Result.buildPageResult(all.getTotalElements(), VOList);
//	}
//
//	@PreAuth("admin")
//	@ResponseBody
//	@GetMapping("/server/findAllAvailable")
//	public Result<Object> findAll() {
//		List<Server> all = serverService.queryAllAvailable();
//		List<ServerVO> voList = all.stream().map(server -> server.toVO(ServerVO.class)).collect(Collectors.toList());
//		return new Result<>(Result.CODE_SUCCESS, null, voList);
//	}
//
//	@PreAuth("vip")
//	@ResponseBody
//	@GetMapping("/server/findServersForAccount")
//	public Result findServersForAccount(@CookieValue(KVConstant.COOKIE_NAME) String auth) {
//
//		UserVO user = userCache.getCache(auth);
//		List<AccountVO> accounts = accountService.getAccounts(user.getId());
//		if (accounts.size() != 1) return Result.builder().code(500).message("用户存在多个账号/或者账号为空").build();
//		AccountVO account = accounts.get(0);
//		Account data = Account.builder()
//				.accountNo(account.getAccountNo())
//				.level(account.getLevel())
//				.build();
//		if (CollectionUtils.isNotEmpty(account.getServerIds())) {
//			data.setServerId(account.getServerIds().stream().map(Object::toString).collect(Collectors.joining(",")));
//		}
//		List<Server> servers = serverService.queryByAccount(data);
//		ArrayList<Object> VOList = Lists.newArrayListWithCapacity(servers.size());
//		servers.forEach(server -> {
//			VOList.add(server.toVO(ServerVO.class));
//		});
//		return Result.buildSuccess(VOList, null);
//	}
//
//	@PreAuth("admin")
//	@ResponseBody
//	@DeleteMapping("/server/{id}")
//	public Result del(@PathVariable Integer id) {
//		Validator.isNotNull(id);
//		serverRepository.deleteById(id);
//		return Result.builder().code(Result.CODE_SUCCESS).build();
//	}
//
//	/**
//	 * 新增
//	 *
//	 * @return
//	 */
//	@PreAuth("admin")
//	@ResponseBody
//	@PostMapping("/server")
//	public Result insert(@RequestBody Server server) {
//		Validator.isNotNull(server);
//		serverService.save(server);
//		return Result.doSuccess();
//	}
//
//	/**
//	 * 修改
//	 */
//	@PreAuth("admin")
//	@ResponseBody
//	@PutMapping("/server")
//	public Result update(@RequestBody Server server) {
//		Validator.isNotNull(server);
//
//
//		serverService.update(server);
//
//		//todo 修改服务器后的逻辑 1.更新账号2.推送到中间件
//		return Result.builder().code(Result.CODE_SUCCESS).build();
//	}
}
