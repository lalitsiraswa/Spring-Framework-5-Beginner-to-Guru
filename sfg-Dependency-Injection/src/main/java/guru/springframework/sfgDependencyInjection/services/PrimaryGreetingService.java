package guru.springframework.sfgDependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// Spring Managed Component
@Service // Field greetingService in guru.springframework.sfgDependencyInjection.controllers.PropertyInjectedController
// required a bean of type 'guru.springframework.sfgDependencyInjection.services.GreetingService'
// that could not be found.
@Primary // The @Qualifier take precedence over @Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World! - From The Primary Bean";
    }
}
