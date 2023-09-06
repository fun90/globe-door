package com.fun90.globe.door.model.vo;

import com.fun90.globe.door.model.BaseModel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class UserVO extends BaseModel {
	private String email;
	private String nickName;
	private String role;

	private Integer status = 1;

	private String remark;

	private String vCode;
	//邀请码
	private String inviteCode;


}
