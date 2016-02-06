package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.config.api.model.Property;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by beolnix on 06/02/16.
 */
public class PluginConfig {
    private final String logsDirPath;
    private final Logger logger;
    private final String pluginDirPath;
    private final File pluginDir;
    private final Map<String, String> propMap = new HashMap<>();

    public PluginConfig(String logsDirPath, Logger logger, String pluginDirPath, File pluginDir, List<Property> properties) {
        this.logsDirPath = logsDirPath;
        this.logger = logger;
        this.pluginDirPath = pluginDirPath;
        this.pluginDir = pluginDir;

        properties.forEach(p -> propMap.put(p.getName(), p.getValue()));
    }

    public String getLogsDirPath() {
        return logsDirPath;
    }

    public Logger getLogger() {
        return logger;
    }

    public String getPluginDirPath() {
        return pluginDirPath;
    }

    public File getPluginDir() {
        return pluginDir;
    }

    public String getPropertyByName(String name) {
        return propMap.get(name);
    }
}
