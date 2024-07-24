package com.easy_mart.landing.exception;

public class ProductException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	private String message;
	public ProductException() {
		this.message = "Product Exception";
	}

	public ProductException(String message) {
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
