package guru.springframework.sfgDependencyInjection.services;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
