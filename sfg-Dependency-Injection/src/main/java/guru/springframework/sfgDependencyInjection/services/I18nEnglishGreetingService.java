package guru.springframework.sfgDependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("ENGLISH")
// Spring Managed Component
// @Service("i18nService") // Field greetingService in guru.springframework.sfgDependencyInjection.controllers.PropertyInjectedController
// required a bean of type 'guru.springframework.sfgDependencyInjection.services.GreetingService'
// that could not be found.
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - ENGLISH";
    }
}
