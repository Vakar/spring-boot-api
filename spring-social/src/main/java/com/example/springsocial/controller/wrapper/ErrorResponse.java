package com.example.springsocial.controller.wrapper;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse<T> {
    private ErrorDTO<T> error;    public ErrorResponse(T object, String message) {
        error = new ErrorDTO<T>(object, message);
    }
    public ErrorDTO<T> getError() {
        return error;
    }    public void setError(ErrorDTO<T> error) {
        this.error = error;
    }
}
