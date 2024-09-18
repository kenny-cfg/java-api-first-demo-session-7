package com.zuzanna.apidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public PingResponse ping() {
        var response = new PingResponse();
        response.setMessage("Moge is cool!");
        return response;
    }

    @RequestMapping(path = "/ping/ping", method = RequestMethod.GET)
    public PingResponse pingPing() {
        var response = new PingResponse();
        response.setMessage("Everyone is ace!");
        return response;
    }
}
