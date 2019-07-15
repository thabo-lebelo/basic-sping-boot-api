package com.thabolebelo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String hello() {
        return "Welcome to Thabo's backend app!";
    }
}
