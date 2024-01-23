package com.qsp.employee_management_system.exception;

public class AddressNotFound extends RuntimeException{
	private String message;

	public AddressNotFound(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		
		return message;
	}
}
