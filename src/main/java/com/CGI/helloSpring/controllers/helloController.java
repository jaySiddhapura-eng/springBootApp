package com.CGI.helloSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }

    @RequestMapping("/world")
    public String method(){
        return "world";
    }
}
