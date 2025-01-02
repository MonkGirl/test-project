package com.monkgirl.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author MissYoung
 * @version 0.1
 * @since 2024-12-25
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World! Let's start the party!";
    }

    @GetMapping("/today")
    public String day(){
        return "Nice day! Today is Thursday! Yesterday is Christmas Day";
    }

    @GetMapping("/adjust")
    public Map<String, String> adjust(){
        return Map.of("name", "icarus", "age", "30");
    }
}
