package com.beolnix.marvin.plugins.api;

/**
 * Interface used by marvin-core for subscription on deploy and undeploy events launched by PluginsProvider
 * Created by beolnix on 31/10/15.
 */
public interface PluginsListener {

    /**
     * Method is executed by PluginProvider if it registered new plugin
     * @param imPlugin
     */
    void deployPlugin(IMPlugin imPlugin);

    /**
     * Method is executed by PluginProvider if it unregistered the plugin
     * @param imPlugin
     */
    void undeployPlugin(IMPlugin imPlugin);

    /**
     * Method is executed by PluginProvider if it catch error during plugin registration
     * @param
     */
    void onError(String pluginName, Throwable e);

}
