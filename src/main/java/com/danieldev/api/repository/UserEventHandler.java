package com.danieldev.api.repository;

import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.danieldev.api.model.User;

@RepositoryEventHandler(User.class)
public class UserEventHandler {

	@HandleBeforeSave
	public void handleUserSave(User user) {
		System.out.println("Handle Before Save -----");
	}
	
}
