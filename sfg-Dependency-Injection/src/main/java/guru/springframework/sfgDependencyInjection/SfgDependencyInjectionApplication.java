package guru.springframework.sfgDependencyInjection;

import guru.springframework.sfgDependencyInjection.config.GreetingServiceConfig;
import guru.springframework.sfgDependencyInjection.config.SfgConfiguration;
import guru.springframework.sfgDependencyInjection.controllers.*;
import guru.springframework.sfgDependencyInjection.datasource.FakeDataSource;
import guru.springframework.sfgDependencyInjection.services.PrototypeBean;
import guru.springframework.sfgDependencyInjection.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLOutput;
//@PropertySource("classpath:datasource.properties")
//@ImportResource("classpath:sfgdi-config.xml")
@SpringBootApplication
@ComponentScan(basePackages = {"com.springframework.pets", "guru.springframework.sfgDependencyInjection"})
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDependencyInjectionApplication.class, args);
//		MyController myController = applicationContext.getBean(MyController.class);
//		MyController myController = (MyController) applicationContext.getBean("myController");
//
//		PetController petController = applicationContext.getBean(PetController.class);
//		System.out.println("------------------ The Best Pet Is ------------------");
//		System.out.println(petController.whichPetIsTheBest());
//
//		System.out.println("------------------ Primary Bean ------------------");
//		System.out.println(myController.sayHello());
//
//		System.out.println("------ Property Based Dependency Injection Using Spring ------");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("------ Setter Based Dependency Injection Using Spring ------");
//		SetterInjectedController setterInjectedController = (SetterInjectedController)applicationContext.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("------ Constructor Based Dependency Injection Using Spring ------");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.sayGreeting());
//
//		System.out.println("------------------ Spring Profiles ------------------");
//		I18nController i18nController = (I18nController)applicationContext.getBean("i18nController");
//		System.out.println(i18nController.sayHello());

//		System.out.println("------------------ Bean Scopes ------------------");
//		SingletonBean singletonBean1 = (SingletonBean) applicationContext.getBean("singletonBean");
//		SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.getMyScope());
//		SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.getMyScope());
//
//		PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.getMyScope());
//		PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.getMyScope());

		System.out.println("------------------ Using Properties Source ------------------");
		FakeDataSource fakeDataSource = (FakeDataSource)applicationContext.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		System.out.println("------------------ Properties Binding ------------------");
		SfgConfiguration sfgConfiguration = (SfgConfiguration)applicationContext.getBean("sfgConfiguration");
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());
		GreetingServiceConfig gsc = (GreetingServiceConfig) applicationContext.getBean("greetingServiceConfig");
		System.out.println(gsc.hello());
	}
}
