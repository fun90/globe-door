package com.fun90.globe.door.model.dto;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;

    private String password;
}