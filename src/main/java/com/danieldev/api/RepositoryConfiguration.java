package com.danieldev.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danieldev.api.repository.UserEventHandler;

@Configuration
public class RepositoryConfiguration {
	
	@Bean
	UserEventHandler userEventHandler() {
		return new UserEventHandler();
	}
	
}
