package com.sportplatform.handler;

import com.sportplatform.common.ErrorResponse;
import com.sportplatform.util.StringFormat;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

@ControllerAdvice
public class CustomExceptionHandler {
    private final HttpServletRequest request;
    public CustomExceptionHandler(HttpServletRequest request) {
        this.request = request;
    }

    // Handler Exception Validation
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(ex.getStatusCode().value());
        errorResponse.setMessage(Objects.requireNonNull(ex.getBindingResult().getFieldError()).getDefaultMessage());
        errorResponse.setPath(request.getRequestURI());  // Dev mode using path, Production wil remove
        return ResponseEntity.badRequest().body(errorResponse);
    }

    // Handler Exception Response Status
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleResponseStatusExceptions(ResponseStatusException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(ex.getStatusCode().value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setPath(request.getRequestURI());  // Dev mode using path, Production wil remove
        return ResponseEntity.status(ex.getStatusCode()).body(errorResponse);
    }

    // Handler Exception JPA
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponse> handleDataAccessException(DataIntegrityViolationException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(HttpStatus.CONFLICT.value());
        String mesString =  null;
        List<String> errorDetail = StringFormat.extractParamsFromErrorMessage(ex.getMessage());
        if(errorDetail != null && !errorDetail.isEmpty()) {
            mesString = errorDetail.get(0) + " already exists!";
        }
        errorResponse.setMessage(mesString);
        errorResponse.setPath(request.getRequestURI());  // Dev mode using path, Production wil remove
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<ErrorResponse> handleDataAccessException(DataAccessException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(400);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setPath(request.getRequestURI());  // Dev mode using path, Production wil remove
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    // Handler All Remaining Exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setPath(request.getRequestURI());  // Dev mode using path, Production wil remove
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }
}

