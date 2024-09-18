package com.zuzanna.apidemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ping")
public class PingController {
    @GetMapping("first")
    public PingResponse ping() {
        return PingResponse
                .builder()
                .message("Moge is cool!")
                .build();
    }

    @GetMapping("header")
    public String pingHeader(
            @RequestHeader String poobum
    ) {
        return poobum;
    }

    @GetMapping("variable/{variable}")
    public String pingWithVariable(
            @PathVariable String variable
    ) {
        return "Your variable was: " + variable;
    }

    @GetMapping("query")
    public String pingWithQuery(
            @RequestParam String queryVariable
    ) {
        return "You variable was: " + queryVariable;
    }

    @PostMapping("echo")
    public ResponseEntity<PingResponse> echo(
            @RequestBody PingRequest pingRequest
    ) {
        if (pingRequest.getGreeting() == null) {
            return ResponseEntity.notFound().build();
        }
        var response = PingResponse.builder()
                .message("You greeted me with: " + pingRequest.getGreeting())
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("second")
    public PingResponse pingPing() {
        return PingResponse.builder()
                .message("first message")
                .secondMessage("second message")
                .build();
    }
}
