package com.example.smartaudit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /*
    请求hello 输出hello
    * */
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello springboot";
    }
}
