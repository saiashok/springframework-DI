package com.masterofspring.DependencyInjectionExamples.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements  GreetingService{
    @Override
    public String greet() {
        return "Hello World...!- Setter";
    }
}
