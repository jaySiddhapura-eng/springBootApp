package com.CGI.helloSpring.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class sample1Controller {

    @RequestMapping("/sample")
    public String index(){
        return "sample";
    }

}
