package guru.springframework.sfgDependencyInjection.config;

import guru.springframework.sfgDependencyInjection.services.ConstructorInjectedGreetingService;
import guru.springframework.sfgDependencyInjection.services.PropertyInjectedGreetingService;
import guru.springframework.sfgDependencyInjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java Based Configuration
@Configuration
public class GreetingServiceConfig {
    // To make this spring component, we need to @Annotated with @Bean
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (constructorInjectedGreetingService)
    @Bean
    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
        return new ConstructorInjectedGreetingService();
    }
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (propertyInjectedGreetingService)
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (setterInjectedGreetingService)
    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
