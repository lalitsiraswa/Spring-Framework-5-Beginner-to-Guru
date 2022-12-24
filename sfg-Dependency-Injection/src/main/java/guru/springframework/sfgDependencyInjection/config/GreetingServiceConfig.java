package guru.springframework.sfgDependencyInjection.config;

import guru.springframework.sfgDependencyInjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Profile("ENGLISH")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(){
        return new I18nEnglishGreetingService();
    }
    @Profile({"HINDI", "default"})
    @Bean("i18nService")
    I18nHindiGreetingService i18nHindiGreetingService(){
        return new I18nHindiGreetingService();
    }
    @Profile("SPANISH")
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService(){
        return new I18nSpanishGreetingService();
    }
}
