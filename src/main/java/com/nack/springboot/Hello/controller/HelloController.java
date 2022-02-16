package com.nack.springboot.Hello.controller;


import com.nack.springboot.Hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private  HelloService helloService;

    @GetMapping(value = "/test")
    public String Hello(){
        return helloService.getHello();
    }

}
