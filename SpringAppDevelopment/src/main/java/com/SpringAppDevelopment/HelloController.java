package com.SpringAppDevelopment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC1: Simple Hello World
    @GetMapping("/uc1")
    public String sayHelloUC1() {
        return "Hello from BridgeLabz";
    }
}

