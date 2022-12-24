package guru.springframework.sfgDependencyInjection.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return "Hello World! - ENGLISH";
    }
}
