package com.formation.service;

import org.springframework.stereotype.Component;

/**
 * Implementation of {@link IFeedback} using the console as output
 */
@Component
public class FeedbackToConsole implements IFeedback {
	public void say(String something) {
		System.out.println(something);
	}
}