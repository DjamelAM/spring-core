package com.formation.service;

import java.io.IOException;

/**
 * Interface to give feedback to the user
 *
 */
public interface IFeedback {
	public void say(String something) throws IOException;
}