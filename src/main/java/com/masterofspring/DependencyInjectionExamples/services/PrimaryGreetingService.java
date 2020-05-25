package com.masterofspring.DependencyInjectionExamples.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements  GreetingService{
    @Override
    public String greet() {
        return "hello world- Primary";
    }
}
