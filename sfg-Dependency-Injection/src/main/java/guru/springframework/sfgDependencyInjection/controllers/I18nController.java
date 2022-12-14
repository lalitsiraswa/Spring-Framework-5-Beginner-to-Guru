package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
// I18n is for Internationalisation
@Controller
public class I18nController {
    private final GreetingService greetingService;
    // @Autowired // Optional in constructor
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
