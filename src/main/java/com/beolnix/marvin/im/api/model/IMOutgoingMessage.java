package com.beolnix.marvin.im.api.model;

/**
 * Created by DAtmakin on 11/3/2015.
 */
public class IMOutgoingMessage extends IMMessage {

    private final String recepient;
    private final String fromPlugin;

    public IMOutgoingMessage(String rawMessageBody,
                             String botName,
                             boolean conference,
                             String conferenceName,
                             String recepient,
                             String fromPlugin,
                             String protocol) {
        super(rawMessageBody, botName, conference, conferenceName, protocol);

        this.recepient = recepient;
        this.fromPlugin = fromPlugin;
    }

    @Override
    public String toString() {
        return "IMOutgoingMessage{" +
                "recepient='" + recepient + '\'' +
                ", fromPlugin='" + fromPlugin + '\'' +
                '}';
    }

    public String getRecepient() {
        return recepient;
    }

    public String getFromPlugin() {
        return fromPlugin;
    }
}
