package com.fun90.globe.door.mapstruct;

import com.fun90.globe.door.model.entity.User;
import com.fun90.globe.door.model.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, imports = {

})
public interface UserMapper {

    UserVO toVo(User server);

}
