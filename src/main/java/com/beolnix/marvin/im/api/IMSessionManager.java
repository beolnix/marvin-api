package com.beolnix.marvin.im.api;

import com.beolnix.marvin.config.api.error.ConfigurationException;
import com.beolnix.marvin.plugins.api.PluginsManager;

import java.util.Map;

/**
 * Basic interface for IM Session Manager implemented in marvin core.
 * IM Session Manager interface is accessible for plugins.
 * Created by beolnix on 31/10/15.
 */
public interface IMSessionManager {
    /**
     * Sends message
     * @param outMsg
     */
    void sendMessage(IMOutgoingMessage outMsg);

    /**
     * Registers new IMSessionProvider.
     * There can be only one IM Session Provider per protocol
     * @param imSessionProvider @see
     */
    void registerIMSessionProvider(IMSessionProvider imSessionProvider);

    /**
     * Create sessions according to the configuration provided by @see com.beolnix.marvin.config.api.ConfigurationProvider .
     * @param pluginManager @see com.beolnix.marvin.plugins.api.PluginsManager
     * @throws ConfigurationException
     */
    void createSessions(PluginsManager pluginManager) throws ConfigurationException;

    /**
     * Creates session for the botName. BotName is used to get BotSettings from @see com.beolnix.marvin.config.api.ConfigurationProvider
     * @param botName
     * @param pluginManager
     * @throws ConfigurationException
     */
    void createSessionFor(String botName, PluginsManager pluginManager) throws ConfigurationException;
    Map<String, IMSession> getIMSessions();
    IMSession getIMSession(String botName);
}
