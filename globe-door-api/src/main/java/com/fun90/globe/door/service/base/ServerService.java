package com.fun90.globe.door.service.base;


import com.fun90.globe.door.mapstruct.ServerMapper;
import com.fun90.globe.door.model.entity.Server;
import com.fun90.globe.door.model.vo.ServerVO;
import com.fun90.globe.door.repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServerService {
	@Autowired
	private ServerRepository serverRepository;
	@Autowired
	private ServerMapper serverMapper;

	public ServerVO findById(Integer id) {
		Server server = serverRepository.findById(id).orElse(null);
		return serverMapper.toVo(server);
	}
}
