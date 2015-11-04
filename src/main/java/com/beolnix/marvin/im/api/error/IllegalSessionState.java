package com.beolnix.marvin.im.api.error;

/**
 * Created by beolnix on 31/10/15.
 */
public class IllegalSessionState extends Exception {

    public IllegalSessionState(String message) {
        super(message);
    }

    public IllegalSessionState(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalSessionState(Throwable cause) {
        super(cause);
    }
}
