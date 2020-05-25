package com.masterofspring.DependencyInjectionExamples.Controllers;

import com.masterofspring.DependencyInjectionExamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public  GreetingService greetingService;

    public String getGreeting(){
        return greetingService.greet();
    }


}
