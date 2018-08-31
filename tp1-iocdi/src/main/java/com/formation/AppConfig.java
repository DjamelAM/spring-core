package com.formation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.formation.service.FeedbackToConsole;
import com.formation.service.IFeedback;
import com.formation.user.UserInteraction;

@Configuration
public class AppConfig {
	@Bean
	public IFeedback spring() {
		return new FeedbackToConsole();
	}

	@Bean
	public UserInteraction UserBean() {
		return new UserInteraction();
	}
}
