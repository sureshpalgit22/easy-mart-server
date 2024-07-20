package com.easy_mart.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig{
	 public JerseyConfig() {
	        packages("com.easy_mart.landing.endpoint");
	    }
}
