package br.edu.unime.api2.controller.exceptions;

import org.springframework.http.HttpStatus;

import java.time.Instant;

public class StandardError {
    private Instant timestamp;
    private Integer status;
    private String message;
    private String path;

    public StandardError() {
    }

    public StandardError(HttpStatus httpStatus, String message) {
    }

    public StandardError(HttpStatus httpStatus, String localizedMessage, String errorOccurred) {
    }

    public StandardError(String message, String description) {
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
