package guru.springframework.sfgDependencyInjection.services;

import guru.springframework.sfgDependencyInjection.repositories.EnglishGreetingRepository;

//@Profile("ENGLISH")
// Spring Managed Component
// @Service("i18nService") // Field greetingService in guru.springframework.sfgDependencyInjection.controllers.PropertyInjectedController
// required a bean of type 'guru.springframework.sfgDependencyInjection.services.GreetingService'
// that could not be found.
public class I18nEnglishGreetingService implements GreetingService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
