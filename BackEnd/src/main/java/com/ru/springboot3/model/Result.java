package com.ru.springboot3.model;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    private Integer size;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> Result<T> success(T data) {
        return new Result<>(200, null, data);
    }
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);
    }

}