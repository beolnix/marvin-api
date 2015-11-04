package com.beolnix.marvin.config.api.error;

/**
 * Created by beolnix on 31/10/15.
 */
public class ConfigurationException extends Exception {

    public ConfigurationException(String message) {
        super(message);
    }

    public ConfigurationException(Throwable cause) {
        super(cause);
    }
}
