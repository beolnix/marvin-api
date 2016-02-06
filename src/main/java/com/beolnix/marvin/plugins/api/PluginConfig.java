package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.config.api.model.Property;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/**
 * Created by beolnix on 06/02/16.
 */
public class PluginConfig {
    private final Logger logger;
    private final File pluginDir;
    private final Map<String, String> propMap = new HashMap<>();

    public PluginConfig(Logger logger, File pluginDir, List<Property> properties) {
        this.logger = logger;
        this.pluginDir = pluginDir;

        properties.forEach(p -> propMap.put(p.getName(), p.getValue()));
    }

    public Logger getLogger() {
        return logger;
    }

    public File getPluginDir() {
        return pluginDir;
    }

    public String getPropertyByName(String name) {
        return propMap.get(name);
    }
}
