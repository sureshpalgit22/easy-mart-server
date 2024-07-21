package com.easy_mart.landing.exception;

public class OrderException extends RuntimeException{
	
	private String message;
	
	public OrderException()
	{
		this.message="Order_Exception";
	}
	public OrderException(String message)
	{
		this.message=message;
	}
	
	
	@Override
	public String getMessage()
	{
		return this.message;
	}

}
