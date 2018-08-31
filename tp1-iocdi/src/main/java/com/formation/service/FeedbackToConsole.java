package com.formation.service;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Component;

/**
 * Implementation of {@link IFeedback} using the console as output
 */
@Component
public class FeedbackToConsole implements IFeedback {
	public void say(String something) throws IOException {
		// System.out.println(something);
		FileWriter fichier = new FileWriter("Feedback.txt", true);
		fichier.write(something);
		fichier.close();

	}
}