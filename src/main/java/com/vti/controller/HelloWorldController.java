package com.vti.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloWorldController {
    @GetMapping
    @ResponseBody
    public String helloApp() {
        return "Hello Nhàn Java Dev";
    }
}
