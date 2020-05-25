package com.masterofspring.DependencyInjectionExamples;

import com.masterofspring.DependencyInjectionExamples.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionExamplesApplication {

	public static void main(String[] args) {
	ApplicationContext ctx= SpringApplication.run(DependencyInjectionExamplesApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());


	System.out.println("------------- Primary Bean");
	MyController myController = (MyController) ctx.getBean("myController");
	 	System.out.println(myController.sayHello());

		System.out.println("----------- PropertyInjecected >>>> Least Preffered standard");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------- SetterInjected >>>>> Somewhat less preferred");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------- ConstructorInjected >>>>> Preferred");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
