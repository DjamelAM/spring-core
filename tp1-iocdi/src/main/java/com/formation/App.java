package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserInteraction user = applicationContext.getBean(UserInteraction.class);
		user.sayHello("Dylan");
		System.out.println("Hello World!");
		user.sayGoodBye("Dylan");
	}
}
