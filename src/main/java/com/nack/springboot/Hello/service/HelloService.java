package com.nack.springboot.Hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {



    public String getHello(){
        return "Hello Service";
    }

}
