package com.easy_mart.landing.exception;

public class UserException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String message;
	public UserException() {
		this.message = "User Exception";
	}

	public UserException(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
