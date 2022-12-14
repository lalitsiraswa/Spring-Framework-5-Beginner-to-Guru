package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyController {
    private final GreetingService greetingService;
    // Because there is no @Qualifier, the @Primary Bean will be injected here
    // @Autowired // Optional in Constructor
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // In the below case the @Qualifier will have higher precedence so "propertyInjectedGreetingService" Bean will be injected
    // @Autowired // Optional in Constructor
    //    public MyController(@Qualifier("propertyInjectedGreetingService") GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
    public String sayHello(){
        // System.out.println("Hello World!");
        return greetingService.sayGreeting();
    }
}
