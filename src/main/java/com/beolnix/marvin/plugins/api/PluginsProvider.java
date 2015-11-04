package com.beolnix.marvin.plugins.api;


/**
 * Created by beolnix on 31/10/15.
 */
public interface PluginsProvider {
    void registerPluginsListener(PluginsListener pluginsListener);
    void unregisterPluginsListener(PluginsListener pluginsListener);
}
