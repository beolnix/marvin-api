package com.beolnix.marvin.im.api.error;

/**
 * Created by beolnix on 31/10/15.
 */
public class IMSessionConnectionException extends Exception {
    public IMSessionConnectionException(String message) {
        super(message);
    }

    public IMSessionConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public IMSessionConnectionException(Throwable cause) {
        super(cause);
    }
}
