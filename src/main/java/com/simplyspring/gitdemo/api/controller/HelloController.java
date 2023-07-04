package com.simplyspring.gitdemo.api.controller;

import com.simplyspring.gitdemo.api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){
        return helloService.greet();
    }

    @GetMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable String name){
        return helloService.greetWithName(name);

    }

}
