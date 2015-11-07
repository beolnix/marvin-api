package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.im.api.model.IMIncomingMessage;

/**
 * Basic interface of core service - PluginsManager
 * Created by beolnix on 31/10/15.
 */
public interface PluginsManager {

    /**
     * Should register new Plugins provider.
     * @param pluginsProvider
     */
    void registerPluginsProvider(PluginsProvider pluginsProvider);

    /**
     * Passes messages to all deployed plugins
     * @param IMIncomingMessage
     */
    void process(IMIncomingMessage IMIncomingMessage);
}
