package com.example.springbootmasterpractise.exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {

    private final String message;
    private final HttpStatus httpStatus;
    private final Throwable throwable;
    private final ZonedDateTime zonedDateTime;

    public ApiException(String message,
                        Throwable throwable,
                        HttpStatus httpStatus,
                        ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.throwable = throwable;
        this.zonedDateTime = zonedDateTime;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "message='" + message + '\'' +
                ", httpStatus=" + httpStatus +
                ", throwable=" + throwable +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }
}
