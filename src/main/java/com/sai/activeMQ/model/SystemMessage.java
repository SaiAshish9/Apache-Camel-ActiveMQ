package com.sai.activeMQ.model;

import lombok.Data;

@Data
public class SystemMessage {
    private String source;
    private String message;
}
