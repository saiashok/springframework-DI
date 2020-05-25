package com.masterofspring.DependencyInjectionExamples.Controllers;

import com.masterofspring.DependencyInjectionExamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private  final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String getGreeting(){
        return  this.greetingService.greet();
    }
}
