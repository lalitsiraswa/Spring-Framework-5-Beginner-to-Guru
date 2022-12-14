package guru.springframework.sfgDependencyInjection;

import guru.springframework.sfgDependencyInjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDependencyInjectionApplication.class, args);
//		MyController myController = applicationContext.getBean(MyController.class);
		MyController myController = (MyController) applicationContext.getBean("myController");

		System.out.println("------------------ Primary Bean ------------------");
		System.out.println(myController.sayHello());

		System.out.println("------ Property Based Dependency Injection Using Spring ------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter Based Dependency Injection Using Spring ------");
		SetterInjectedController setterInjectedController = (SetterInjectedController)applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor Based Dependency Injection Using Spring ------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());

		System.out.println("------------------ Spring Profiles ------------------");
		I18nController i18nController = (I18nController)applicationContext.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}
}
