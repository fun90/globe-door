package com.fun90.globe.door.model.dto;

import lombok.Data;

/**
 * 命令执行结果
 */
@Data
public class CommandResult {
    private int exitStatus;
    private String stdout;
    private String stderr;
}