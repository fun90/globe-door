package com.fun90.globe.door.model.entity;

import com.fun90.globe.door.model.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Server extends BaseModel {
    private String serverName;
    private String clientDomain;
    private Integer clientPort = 443;
    private Boolean supportTLS = true;
    /**
     * proxy中间件管理 ip port
     */
    private String proxyIp = "127.0.0.1";
    private Integer proxyPort = 8091;
    /**
     * v2ray 开放 的 ip 和端口
     */
    private String v2rayIp = "127.0.0.1";
    private Integer v2rayManagerPort = 62789;
    private Integer v2rayPort = 6001;
    private String protocol;
    /**
     * 流量倍数
     */
    private Double multiple;

    /**
     * 说明
     */
    private String desc;
    /**
     * 服务器状态
     */
    private Integer status;

    private String inboundTag;
    /**
     * 服务器等级
     */
    @Column(columnDefinition = "smallint default 0")
    private Short level;
    /**
     * ws路径
     */
    private String wsPath = "/ws/%s/";
    /**
     * 传输方式：ws、tcp、kcp
     */
    private String network = "ws";
}

