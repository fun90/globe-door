package com.fun90.globe.door.mapstruct;

import com.fun90.globe.door.model.entity.Server;
import com.fun90.globe.door.model.vo.ServerVO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, imports = {

})
public interface ServerMapper {

    ServerVO toVo(Server server);

}
