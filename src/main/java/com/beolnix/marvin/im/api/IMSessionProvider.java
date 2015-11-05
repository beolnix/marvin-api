package com.beolnix.marvin.im.api;

import com.beolnix.marvin.config.api.BotSettings;
import com.beolnix.marvin.plugins.api.PluginsManager;

/**
 * Basic interface for the IM Session providers.
 * To add support of new protocol to marvin-core this interface must be implemented
 * Created by DAtmakin on 11/2/2015.
 */
public interface IMSessionProvider {

    /**
     * Returns newly created session
     * @param botSettings
     * @param pluginsManager
     * @return
     */
    IMSession getNewSession(BotSettings botSettings, PluginsManager pluginsManager);

    /**
     * Returns the name of supported protocol
     * @return
     */
    String getProtocol();
}
