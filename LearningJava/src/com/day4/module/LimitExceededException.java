package com.day4.module;

public class LimitExceededException extends Exception{
    public LimitExceededException(String message) {
        super(message);
    }
}
