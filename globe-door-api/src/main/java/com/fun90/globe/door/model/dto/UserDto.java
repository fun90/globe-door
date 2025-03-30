package com.fun90.globe.door.model.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String nickName;
    private String role;
}