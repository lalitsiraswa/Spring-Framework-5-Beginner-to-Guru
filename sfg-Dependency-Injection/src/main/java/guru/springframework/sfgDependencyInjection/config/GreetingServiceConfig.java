package guru.springframework.sfgDependencyInjection.config;

import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgDependencyInjection.repositories.EnglishGreetingRepository;
import guru.springframework.sfgDependencyInjection.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgDependencyInjection.services.*;
import org.springframework.context.annotation.*;

// Java Based Configuration
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
    // To make this spring component, we need to @Annotated with @Bean
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (constructorInjectedGreetingService)
    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }
    @Profile({"default", "DOG"})
    @Bean
    PetService DogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }
    @Profile("CAT")
    @Bean
    PetService CatPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }
    // @Bean
//    ConstructorInjectedGreetingService constructorInjectedGreetingService(){
//        return new ConstructorInjectedGreetingService();
//    }
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (propertyInjectedGreetingService)
    // @Bean
//    PropertyInjectedGreetingService propertyInjectedGreetingService(){
//        return new PropertyInjectedGreetingService();
//    }
    // By-Default the name of generated Bean inside the Spring Context is the name of the method (setterInjectedGreetingService)
    // @Bean
//    SetterInjectedGreetingService setterInjectedGreetingService(){
//        return new SetterInjectedGreetingService();
//    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
    @Profile("ENGLISH")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
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
