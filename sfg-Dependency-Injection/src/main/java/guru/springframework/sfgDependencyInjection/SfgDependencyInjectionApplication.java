package guru.springframework.sfgDependencyInjection;

import guru.springframework.sfgDependencyInjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDependencyInjectionApplication.class, args);
//		MyController myController = applicationContext.getBean(MyController.class);
		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
