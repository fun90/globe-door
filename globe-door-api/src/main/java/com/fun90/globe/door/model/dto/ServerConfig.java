package com.fun90.globe.door.model.dto;

import lombok.Data;

/**
 * 服务器配置
 */
@Data
public class ServerConfig {
    private String host;
    private int port = 22;
    private String username;
    private String password;
    private String privateKeyPath;
    private String passphrase;
}
