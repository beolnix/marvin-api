package com.beolnix.marvin.plugins.api;


/**
 * Basic interface for Plugins Provider
 * Created by beolnix on 31/10/15.
 */
public interface PluginsProvider {

    /**
     * Method used for the registration of PluginsListener by PluginsManager.
     * methods of pluginsListener must be executed when plugins provider deploys or undeploys a plugin
     * @param pluginsListener
     */
    void registerPluginsListener(PluginsListener pluginsListener);

    /**
     * Method used for the unregistration of the Plugins Provider.
     * @param pluginsListener
     */
    void unregisterPluginsListener(PluginsListener pluginsListener);
}
