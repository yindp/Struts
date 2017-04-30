package com.yinom.pdd.struts.exception;

/**
 * Created by yindp on 4/30/17.
 */
public class MySystemException extends RuntimeException {
    public MySystemException() {
        super();
    }

    public MySystemException(String message) {
        super(message);
    }

    public MySystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public MySystemException(Throwable cause) {
        super(cause);
    }

    protected MySystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
