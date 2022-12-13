package guru.springframework.sfgDependencyInjection.controllers;

import guru.springframework.sfgDependencyInjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;
    // Property Based Dependency Injection
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}