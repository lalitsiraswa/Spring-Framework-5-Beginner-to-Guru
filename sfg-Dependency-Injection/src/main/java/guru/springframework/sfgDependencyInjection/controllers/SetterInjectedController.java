package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // No bean named 'setterInjectedController' available
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired // Cannot invoke "guru.springframework.sfgDependencyInjection.services.GreetingService.sayGreeting()" because "this.greetingService" is null
//    @Qualifier("setterInjectedGreetingService") // Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
    public void setGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
