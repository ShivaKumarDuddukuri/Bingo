package com.progress.bingo.exception;

/**
 * Created by shivad on 14/6/17.
 */
public class BingoException extends RuntimeException {

    public BingoException() {
    }

    public BingoException(String message) {
        super(message);
    }

    public BingoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BingoException(Throwable cause) {
        super(cause);
    }

    public BingoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
