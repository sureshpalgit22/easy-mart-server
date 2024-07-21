package com.easy_mart.builder;

import java.util.Objects;

import javax.ws.rs.core.Response.Status;

public class SuccessMessage {
	private Status statusCode;
	private String message;
	
	
	SuccessMessage(Status statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		
	}

	/**
	 * @return the statusCode
	 */
	public Status getStatusCode() {
		return statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	

	public static SuccessMessageBuilder statusCode(Status httpStatus) {
		return new SuccessMessageBuilder(httpStatus);
	}

	}
