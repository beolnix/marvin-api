package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.im.api.IMIncomingMessage;

/**
 * Created by beolnix on 31/10/15.
 */
public interface PluginsManager {
    void registerPluginsProvider(PluginsProvider pluginsProvider);
    void process(IMIncomingMessage IMIncomingMessage);
}
