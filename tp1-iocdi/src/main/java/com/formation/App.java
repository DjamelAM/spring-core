package com.formation;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) throws IOException {

		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserInteraction user = applicationContext.getBean(UserInteraction.class);
		user.sayHello("Dylan");
		System.out.println("Hello World!");
		user.sayGoodBye("Dylan");

	}
}
