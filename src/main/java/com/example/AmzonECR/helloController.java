package com.example.AmzonECR;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from rkia!";
    }
    @GetMapping("/bye")
    public String bye() {
        return "bye from rkia!";
    }
}
