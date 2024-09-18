package com.zuzanna.apidemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ping")
public class PingController {
    @GetMapping("first")
    public PingResponse ping() {
        var response = new PingResponse();
        response.setMessage("Moge is cool!");
        return response;
    }

    @PostMapping("echo")
    public PingResponse echo(
            @RequestBody PingRequest pingRequest
    ) {
        var response = new PingResponse();
        response.setMessage("You greeted me with: " + pingRequest.getGreeting());
        return response;
    }

    @GetMapping("second")
    public PingResponse pingPing() {
        var response = new PingResponse();
        response.setMessage("Everyone is ace!");
        return response;
    }
}
