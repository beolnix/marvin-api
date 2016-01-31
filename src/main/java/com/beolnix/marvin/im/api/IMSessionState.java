package com.beolnix.marvin.im.api;

/**
 * Created by beolnix on 01/11/15.
 */
public enum IMSessionState {
    NOT_INITIALIZED,
    INITIALIZED,
    CONNECTED,
    CONNECTING,
    RECONNECTING,
    DISCONNECTED,
    ERROR;
}
