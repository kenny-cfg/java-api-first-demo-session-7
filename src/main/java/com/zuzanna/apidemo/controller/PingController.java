package com.zuzanna.apidemo.controller;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<PingResponse> echo(
            @RequestBody PingRequest pingRequest
    ) {
        if (pingRequest.getGreeting() == null) {
            return ResponseEntity.notFound().build();
        }
        var response = new PingResponse();
        response.setMessage("You greeted me with: " + pingRequest.getGreeting());
        return ResponseEntity.ok(response);
    }

    @GetMapping("second")
    public PingResponse pingPing() {
        var response = new PingResponse();
        response.setMessage("Everyone is ace!");
        return response;
    }
}
