package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
