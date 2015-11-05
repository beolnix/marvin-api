package com.beolnix.marvin.plugins.api;

import com.beolnix.marvin.im.api.IMSessionManager;
import com.beolnix.marvin.im.api.IMIncomingMessage;

import java.util.List;
import java.util.Set;

/**
 * Created by beolnix on 31/10/15.
 */
public interface IMPlugin {
    public final String LOGS_PATH_PARAM_NAME = "logsPath";
    public final String DIRECTORY_PARAM_NAME = "dirPath";

    void setIMSessionManager(IMSessionManager imSessionManager);

    String getPluginName();

    boolean isProcessAll();

    List<String> getCommandsList();

    boolean isCommandSupported(String command);

    void process(IMIncomingMessage msg);

    IMPluginState getPluginState();

    String getErrorDescription();

    Set<String> getSupportedProtocols();

    boolean isProtocolSupported(String protocol);

    boolean isAllProtocolsSupported();

}
