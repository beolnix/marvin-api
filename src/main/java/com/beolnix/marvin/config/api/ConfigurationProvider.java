package com.beolnix.marvin.config.api;

import com.beolnix.marvin.config.api.error.ConfigurationException;
import com.beolnix.marvin.config.api.model.Configuration;
import com.beolnix.marvin.config.api.model.PluginsSettings;


import java.util.Map;

/**
 * Basic interface for any Configuration Provider supported by marvin-core
 * Created by beolnix on 31/10/15.
 */
public interface ConfigurationProvider {

    /**
     * Returns provided configuration
     * @return
     * @throws ConfigurationException
     */
    Configuration getConfiguration() throws ConfigurationException;

    /**
     * Returns Bot Settings map extracted from the provided configuration
     * @return
     * @throws ConfigurationException
     */
    Map<String, BotSettings> getBotSettings() throws ConfigurationException;

    /**
     * Returns PluginConfig Settings exctracted from the provided configuration
     * @return
     * @throws ConfigurationException
     */
    PluginsSettings getPluginSettings() throws ConfigurationException;

    /**
     * Persist new configuration passed as a parameter.
     * @param configuration
     * @throws ConfigurationException
     */
    void updateConfiguration(Configuration configuration) throws ConfigurationException;
}
