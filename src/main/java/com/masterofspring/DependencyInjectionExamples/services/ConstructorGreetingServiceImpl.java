package com.masterofspring.DependencyInjectionExamples.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements  GreetingService{
    @Override
    public String greet() {
        return "Hello World...! - Constructor";
    }
}
