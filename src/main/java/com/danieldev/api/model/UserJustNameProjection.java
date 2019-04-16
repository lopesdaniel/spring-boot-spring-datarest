package com.danieldev.api.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "justOnlyName", types = { User.class })
public interface UserJustNameProjection {
	String getName();
}
