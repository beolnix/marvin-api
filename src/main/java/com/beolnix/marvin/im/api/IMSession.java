package com.beolnix.marvin.im.api;

/**
 * Created by beolnix on 31/10/15.
 */
public interface IMSession  {

    String getBotName();

    String getProtocol();

    void sendMessage(IMOutgoingMessage outMsg);

    void connect();

    void disconnect();

    IMSessionState getState();

    String getErrorMessage();

}
