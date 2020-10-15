package com.codersbay;

public class QueueTooSmallException extends Exception {

    public QueueTooSmallException() {
        super("QueueTooSmallException");
    }

    public QueueTooSmallException(String errorMessage) {
        super(errorMessage);
    }
}
