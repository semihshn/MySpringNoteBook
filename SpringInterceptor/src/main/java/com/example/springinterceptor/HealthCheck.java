package com.example.springinterceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping(value = "/healthcheck")
    public String getHealthCheck(){
        return "200 ok";
    }

}
