package com.studentdetails.globalhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentdetails.customexception.AgeNotValidException;

@RestControllerAdvice
public class StudentDetailsGlobalHandler {
	@ExceptionHandler(AgeNotValidException.class)
	
	public ResponseEntity<Object> ageHandling() {
		return new  ResponseEntity<>("Sorry this is not valid age",HttpStatus.BAD_REQUEST);
				
	}

}
