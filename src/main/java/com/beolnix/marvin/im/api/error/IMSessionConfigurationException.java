package com.beolnix.marvin.im.api.error;

/**
 * Created by beolnix on 31/10/15.
 */
public class IMSessionConfigurationException extends Exception {
    public IMSessionConfigurationException(String message) {
        super(message);
    }

    public IMSessionConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IMSessionConfigurationException(Throwable cause) {
        super(cause);
    }
}
