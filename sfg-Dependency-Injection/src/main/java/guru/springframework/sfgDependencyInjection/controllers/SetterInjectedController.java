package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // No bean named 'setterInjectedController' available
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired // Cannot invoke "guru.springframework.sfgDependencyInjection.services.GreetingService.sayGreeting()" because "this.greetingService" is null
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
