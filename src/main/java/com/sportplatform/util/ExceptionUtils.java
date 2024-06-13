package com.sportplatform.util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public class ExceptionUtils {

    public static ResponseStatusException NotFound() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    public static ResponseStatusException NotFound(String message) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, message);
    }
    public static ResponseStatusException NotFound(String message, Throwable cause) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, message,cause);
    }
    public static ResponseStatusException BadRequest() {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
    public static ResponseStatusException BadRequest(String message) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, message);
    }
    public static ResponseStatusException BadRequest(String message, Throwable cause) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, message,cause);
    }
    public static ResponseStatusException Unauthorized() {
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
    }
    public static ResponseStatusException Unauthorized(String message) {
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, message);
    }
    public static ResponseStatusException Unauthorized(String message, Throwable cause) {
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, message,cause);
    }
    public static ResponseStatusException Forbidden() {
        throw new ResponseStatusException(HttpStatus.FORBIDDEN);
    }
    public static ResponseStatusException Forbidden(String message) {
        throw new ResponseStatusException(HttpStatus.FORBIDDEN, message);
    }
    public static ResponseStatusException Forbidden(String message, Throwable cause) {
        throw new ResponseStatusException(HttpStatus.FORBIDDEN, message,cause);
    }
    public static ResponseStatusException InternalServer() {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    public static ResponseStatusException InternalServer(String message) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }
    public static ResponseStatusException InternalServer(String message, Throwable cause) {
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, message, cause);
    }
    public static ResponseStatusException StatusCode(HttpStatus code) {
        throw new ResponseStatusException(code);
    }
    public static ResponseStatusException StatusCode(HttpStatus code,String message) {
        throw new ResponseStatusException(code, message);
    }
    public static ResponseStatusException StatusCode(HttpStatus code,String message,Throwable cause) {
        throw new ResponseStatusException(code, message,cause);
    }
}