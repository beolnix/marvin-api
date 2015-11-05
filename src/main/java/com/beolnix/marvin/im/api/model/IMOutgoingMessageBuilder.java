package com.beolnix.marvin.im.api.model;

/**
 * Created by DAtmakin on 11/3/2015.
 */
public class IMOutgoingMessageBuilder {
    private String rawMessageBody;
    private String botName;
    private boolean conference;
    private String conferenceName;
    private String protocol;
    private String recepient;
    private String fromPlugin;

    public IMOutgoingMessageBuilder() {}

    public IMOutgoingMessageBuilder(IMIncomingMessage imIncomingMessage) {
        this.botName = imIncomingMessage.getBotName();
        this.conference = imIncomingMessage.isConference();
        if (imIncomingMessage.isConference()) {
            this.conferenceName = imIncomingMessage.getConferenceName();
        }
        this.protocol = imIncomingMessage.getProtocol();
    }

    public IMOutgoingMessageBuilder withRawMessageBody(String rawMessageBody) {
        this.rawMessageBody = rawMessageBody;
        return this;
    }

    public IMOutgoingMessageBuilder withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    public IMOutgoingMessageBuilder withConference(boolean conference) {
        this.conference = conference;
        return this;
    }

    public IMOutgoingMessageBuilder withConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public IMOutgoingMessageBuilder withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public IMOutgoingMessageBuilder withRecipient(String recipient) {
        this.recepient = recipient;
        return this;
    }

    public IMOutgoingMessageBuilder withFromPlugin(String fromPlugin) {
        this.fromPlugin = fromPlugin;
        return this;
    }

    public IMOutgoingMessage build() {
        return new IMOutgoingMessage(rawMessageBody, botName, conference, conferenceName, recepient, fromPlugin, protocol);
    }
}
