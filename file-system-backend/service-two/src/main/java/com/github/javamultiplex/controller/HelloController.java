package com.github.javamultiplex.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rohit Agarwal on 20/05/22 11:47 PM
 * @copyright github.com/javamultiplex
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${hello.message}")
    public String message;

    @GetMapping("/hello")
    public String hello(){
        return message;
    }
}
