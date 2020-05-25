package com.masterofspring.DependencyInjectionExamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SPANISH")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements  GreetingService{
    @Override
    public String greet() {
        return "Hola Mundo...! - Spanish";
    }
}
