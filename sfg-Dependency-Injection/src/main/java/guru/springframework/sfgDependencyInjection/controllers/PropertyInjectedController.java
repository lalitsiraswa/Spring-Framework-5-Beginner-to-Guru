package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Spring Managed Component
@Controller // ERROR: No bean named 'propertyInjectedController' available
public class PropertyInjectedController {
    @Autowired // ERROR: Cannot invoke "guru.springframework.sfgDependencyInjection.services.GreetingService.sayGreeting()" because "this.greetingService" is null
    @Qualifier("propertyInjectedGreetingService") // Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
