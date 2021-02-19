package com.learning.sfgdi.services;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
