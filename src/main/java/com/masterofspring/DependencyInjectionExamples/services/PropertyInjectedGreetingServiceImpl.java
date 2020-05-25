package com.masterofspring.DependencyInjectionExamples.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements  GreetingService{
    @Override
    public String greet() {
        return "Hello World...!- Property";
    }
}
