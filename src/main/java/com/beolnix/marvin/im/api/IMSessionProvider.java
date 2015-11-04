package com.beolnix.marvin.im.api;

import com.beolnix.marvin.config.api.BotSettings;
import com.beolnix.marvin.plugins.api.PluginsManager;

/**
 * Created by DAtmakin on 11/2/2015.
 */
public interface IMSessionProvider {
    IMSession getNewSession(BotSettings botSettings, PluginsManager pluginsManager);
    String getProtocol();
}
