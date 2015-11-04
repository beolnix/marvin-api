package com.beolnix.marvin.im.api;

/**
 * Created by DAtmakin on 11/3/2015.
 */
public abstract class IMMessage {
    private final String rawMessageBody;
    private final String botName;
    private final boolean conference;
    private final String conferenceName;
    private final String protocol;

    public IMMessage(String rawMessageBody, String botName, boolean conference, String conferenceName, String protocol) {
        this.rawMessageBody = rawMessageBody;
        this.botName = botName;
        this.conference = conference;
        this.conferenceName = conferenceName;
        this.protocol = protocol;
    }

    public String getRawMessageBody() {
        return rawMessageBody;
    }

    public String getBotName() {
        return botName;
    }

    public boolean isConference() {
        return conference;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public String getProtocol() {
        return protocol;
    }

}
