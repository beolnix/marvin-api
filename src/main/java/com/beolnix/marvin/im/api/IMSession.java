package com.beolnix.marvin.im.api;

/**
 * Basic interface for all IM Sessions supported by marvin-core.
 * IM Session is a bot instance actually. It establishes one connection,
 * receives incoming messages and allow to send the responses
 * Created by beolnix on 31/10/15.
 */
public interface IMSession  {

    /**
     * Returns the bot name.
     * Must correspond with botName from BotSettings used to create this session and be unique.
     * @return
     */
    String getBotName();

    /**
     * Returns supported protocol by this session.
     * @return
     */
    String getProtocol();

    /**
     * Sends message passed as a parameter
     * @param outMsg
     */
    void sendMessage(IMOutgoingMessage outMsg);

    /**
     * Establishes a connection.
     * If connection establishes successfully, the state must be set as CONNECTED.
     * Otherwise the state must not be CONNECTED
     */
    void connect();

    /**
     * Closes connection
     */
    void disconnect();

    /**
     * Returns the current session state
     * @return
     */
    IMSessionState getState();

    /**
     * Returns the text of the latest error.
     * This method can be used if state is ERROR to provide more information to the user.
     * Null - if there were no errors.
     * @return
     */
    String getErrorMessage();

}
