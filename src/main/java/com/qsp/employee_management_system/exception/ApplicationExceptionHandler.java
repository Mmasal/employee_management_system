package com.qsp.employee_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.qsp.employee_management_system.util.ResponseStructure;

//@ControllerAdvice     use in spring mvc
@RestControllerAdvice // use in spring boot
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(PhoneNotFound.class)
	public ResponseEntity<ResponseStructure<String>>handlePhoneNotFoundException(PhoneNotFound ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage(ex.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData("Given phone number is not found in Data Base");
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<ResponseStructure<String>>handleIdNotFoundException(IdNotFound ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage(ex.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData("Given Id is not found in Data Base");
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(MailIdNotFound.class)
	public ResponseEntity<ResponseStructure<String>>handleMailNotFoundException(MailIdNotFound ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage(ex.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData("Given Mail id is not found in Data Base");
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(AddressNotFound.class)
	public ResponseEntity<ResponseStructure<String>>handleAddressNotFoundException(AddressNotFound ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage(ex.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData("Given Address is not found in Data Base");
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(NoDataAvailable.class)
	public ResponseEntity<ResponseStructure<String>>handleNoDataAvailableException(NoDataAvailable ex){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setMessage(ex.getMessage());
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setData("Data is not Available in Data Base");
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		
	}
}
