package com.formation;

import com.formation.service.FeedbackFactory;
import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		UserInteraction userInteraction = new UserInteraction();
		userInteraction.setFactory(new FeedbackFactory());
		userInteraction.sayHello("Dylan");
		userInteraction.sayGoodBye("Dylan");
	}
}
