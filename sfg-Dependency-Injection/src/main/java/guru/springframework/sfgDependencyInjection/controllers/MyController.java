package guru.springframework.sfgDependencyInjection.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!");
        return "Hii Folks!";
    }
}
