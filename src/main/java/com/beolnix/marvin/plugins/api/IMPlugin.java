package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.im.api.IMSessionManager;
import com.beolnix.marvin.im.api.model.IMIncomingMessage;

import java.util.List;
import java.util.Set;

/**
 * Basic interface for Marvin Plugin
 * Created by beolnix on 31/10/15.
 */
public interface IMPlugin {

    void init(PluginConfig pluginConfig, IMSessionManager imSessionManager);

    /**
     * Method should return plugin name.
     * Marvin core will use plugin name to register plugin.
     * @return
     */
    String getPluginName();

    /**
     * If the plugin should process all messages (for example you want to gather some statistics like word counter) -
     * this method must return true.
     * If the plugin should process only specific messages with special commands - this method must return false.
     * @return
     */
    boolean isProcessAll();

    /**
     * Method should return commands list supported by the plugin.
     * @return
     */
    List<String> getCommandsList();

    /**
     * Method must return true if command supported.
     * false - if not.
     * @param command
     * @return
     */
    boolean isCommandSupported(String command);

    /**
     * Method will be executed by marvin-core if
     * - the message includes command supported by the plugin or if plugin processes all messages
     * - the protocol of the message is supported by the plugin or if plugin supports all protocols
     * - the plugin is in INITIALIZED state
     * @param msg
     */
    void process(IMIncomingMessage msg);

    /**
     * Method must return current plugin state
     * @return
     */
    IMPluginState getPluginState();

    /**
     * Method must return the text of the latest error.
     * Method can be executed by marvin-core it plugin is in ERROR state to get more information.
     * @return
     */
    String getErrorDescription();

    /**
     * Method must return the set of supported protocols
     * @return
     */
    Set<String> getSupportedProtocols();

    /**
     * Method must return true if protocol is supported
     * @param protocol
     * @return
     */
    boolean isProtocolSupported(String protocol);

    /**
     * Method must return true if plugin supports all protocols
     * @return
     */
    boolean isAllProtocolsSupported();

}
