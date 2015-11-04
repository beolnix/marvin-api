package com.beolnix.marvin.config.api;

import com.beolnix.marvin.config.api.error.ConfigurationException;


import java.util.Map;

/**
 * Created by beolnix on 31/10/15.
 */
public interface ConfigurationProvider {

    Configuration getConfiguration() throws ConfigurationException;

    Map<String, BotSettings> getBotSettings() throws ConfigurationException;

    PluginsSettings getPluginSettings() throws ConfigurationException;

    void updateConfiguration(Configuration configuration) throws ConfigurationException;
}
