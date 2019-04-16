package com.danieldev.api.repository;

import java.util.logging.Logger;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.danieldev.api.model.User;

@RepositoryEventHandler(User.class)
public class UserEventHandler {
	
	private Logger logger = Logger.getLogger("UserEventHandler Logger ->");

	/*
	 * Com esse método, posso realizar uma operação toda vez q salvar algo. (POST) ou (PUT)
	 */
	@HandleBeforeCreate
	public void handleUserSave(User user) {
		logger.info("<<<---------------- Handle Before Create --------------->>>");
	}
	
}
