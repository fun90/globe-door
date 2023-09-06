package com.fun90.globe.door.model.entity;

import com.fun90.globe.door.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends BaseModel {
	@Column(unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	private String nickName;
	@Column(nullable = false)
	private String role;

	private Integer status = 1;

	private String remark;


	@Transient
	private String vCode;
	//邀请码
	@Transient
	private String inviteCode;
}
