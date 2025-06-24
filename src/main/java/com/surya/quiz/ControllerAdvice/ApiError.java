package com.surya.quiz.ControllerAdvice;

import java.time.LocalDateTime;
import java.util.Map;

public class ApiError {
    private final String errorId;
    private final LocalDateTime timestamp;
    private final int status;
    private final String path;
    private final String message;
    private final Map<String, String> fieldErrors;

    // Constructors
    public ApiError(String errorId, LocalDateTime timestamp, int status, String path, String message, Map<String, String> fieldErrors) {
        this.errorId = errorId;
        this.timestamp = timestamp;
        this.status = status;
        this.path = path;
        this.message = message;
        this.fieldErrors = fieldErrors;
    }

	public String getErrorId() {
		return errorId;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public int getStatus() {
		return status;
	}

	public String getPath() {
		return path;
	}

	public String getMessage() {
		return message;
	}

	public Map<String, String> getFieldErrors() {
		return fieldErrors;
	}

	
	
	
}