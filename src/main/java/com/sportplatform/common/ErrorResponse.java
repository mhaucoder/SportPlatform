package com.sportplatform.common;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private Integer statusCode;
    private String message;
    private LocalDateTime timestamp;
    private String path;
    public ErrorResponse() {
        this.timestamp = LocalDateTime.now();
    }
}
