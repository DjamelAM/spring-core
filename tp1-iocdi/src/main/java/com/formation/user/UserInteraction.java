package com.formation.user;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.IFeedback;

/**
 * Class to make interactions with the user
 */
@Component
public class UserInteraction {
	@Autowired
	IFeedback Feedback;

	public IFeedback getFeedback() {
		return Feedback;
	}

	public void setFeedback(IFeedback feedback) {
		Feedback = feedback;
	}

	/**
	 * To say hello to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayHello(String name) {
		Feedback.say(MessageFormat.format("Hello {0} !", name));
	}

	/**
	 * To say goodbye to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayGoodBye(String name) {
		Feedback.say(MessageFormat.format("Goodbye {0} !", name));
	}
}