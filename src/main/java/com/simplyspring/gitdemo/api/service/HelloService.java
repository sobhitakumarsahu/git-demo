package com.simplyspring.gitdemo.api.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greet() {
        return "Hello there, welcome to rest service world";
    }

    public String greetWithName(String name) {
        return "Hello " + name;
    }
}
