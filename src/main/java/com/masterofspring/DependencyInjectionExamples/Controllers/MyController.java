package com.masterofspring.DependencyInjectionExamples.Controllers;

import com.masterofspring.DependencyInjectionExamples.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return this.greetingService.greet();
    }
}
