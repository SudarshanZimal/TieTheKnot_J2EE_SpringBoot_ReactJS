package com.wedding.springJwt.exception;

public class CustomerServiceException extends RuntimeException {

	public CustomerServiceException() {
		super();
	}

	public CustomerServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerServiceException(String message) {
		super(message);
	}

	
}
