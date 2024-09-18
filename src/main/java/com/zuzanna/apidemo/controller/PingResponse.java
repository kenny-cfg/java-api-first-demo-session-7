package com.zuzanna.apidemo.controller;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PingResponse {
    private String message;
    private String secondMessage;
}
