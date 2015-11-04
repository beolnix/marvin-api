package com.beolnix.marvin.plugins.api.error;

/**
 * Created by beolnix on 31/10/15.
 */
public class PluginsProviderConfigurationException extends Exception {

    public PluginsProviderConfigurationException(String message) {
        super(message);
    }

    public PluginsProviderConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginsProviderConfigurationException(Throwable cause) {
        super(cause);
    }
}
