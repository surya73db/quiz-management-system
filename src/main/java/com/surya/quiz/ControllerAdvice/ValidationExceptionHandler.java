package com.surya.quiz.ControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ValidationExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ApiError> handleValidationExceptions(MethodArgumentNotValidException ex, HttpServletRequest request){
		Map<String, String> fieldErrors = new HashMap<String, String>();
		
		ex.getBindingResult().getFieldErrors().forEach(error ->
					fieldErrors.put(error.getField() + " NOT VALID", error.getDefaultMessage())
				);
		
		String errorId = UUID.randomUUID().toString();
		ApiError apiError = new ApiError(errorId, LocalDateTime.now(), HttpStatus.BAD_REQUEST.value(), request.getRequestURI(), "Validation Failed", fieldErrors);
		
		return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex){
//		Map<String, String> errors = new HashMap<String, String>();
//		
//		ex.getBindingResult().getFieldErrors().forEach(error ->
//					errors.put(error.getField() + " NOT VALID", error.getDefaultMessage())
//				);
//		
//		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNPE(NullPointerException ex) {
	    return new ResponseEntity<>("Something went null: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
