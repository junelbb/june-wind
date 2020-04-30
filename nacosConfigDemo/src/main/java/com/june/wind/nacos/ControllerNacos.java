package com.june.wind.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ControllerNacos {

    @Value("${name}")
    String name;

    @GetMapping("hello")
    public String sayHello(){
        return name;
    }
}
