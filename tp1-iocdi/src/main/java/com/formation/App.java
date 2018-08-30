package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		UserInteraction user = applicationContext.getBean(UserInteraction.class);
		user.sayHello("Dylan");
		System.out.println("Hello World!");
		user.sayGoodBye("Dylan");
	}
}
