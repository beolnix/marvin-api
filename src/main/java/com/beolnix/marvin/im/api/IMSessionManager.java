package com.beolnix.marvin.im.api;

import com.beolnix.marvin.config.api.error.ConfigurationException;
import com.beolnix.marvin.plugins.api.PluginsManager;

import java.util.Map;

/**
 * Created by beolnix on 31/10/15.
 */
public interface IMSessionManager {
    void sendMessage(IMOutgoingMessage outMsg);
    void registerIMSessionProvider(IMSessionProvider imSessionProvider);
    void createSessions(PluginsManager pluginManager) throws ConfigurationException;
    void createSessionFor(String botName, PluginsManager pluginManager) throws ConfigurationException;
    Map<String, IMSession> getIMSessions();
    IMSession getIMSession(String botName);
}
