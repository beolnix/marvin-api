package com.beolnix.marvin.im.api.model;

import java.util.Calendar;

/**
 * Created by DAtmakin on 11/3/2015.
 */
public class IMIncomingMessageBuilder {
    private String rawMessageBody;
    private String botName;
    private boolean conference;
    private String conferenceName;
    private String protocol;
    private String author;
    private Calendar timestamp;

    private boolean command;
    private String commandName;
    private String commandAttributes;
    private String commandSymbol;

    public IMIncomingMessageBuilder() {}

    public IMIncomingMessageBuilder withRawMessageBody(String rawMessageBody) {
        this.rawMessageBody = rawMessageBody;
        return this;
    }

    public IMIncomingMessageBuilder withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    public IMIncomingMessageBuilder withConference(boolean conference) {
        this.conference = conference;
        return this;
    }

    public IMIncomingMessageBuilder withConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public IMIncomingMessageBuilder withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public IMIncomingMessageBuilder withAutor(String autor) {
        this.author = autor;
        return this;
    }

    public IMIncomingMessageBuilder withTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public IMIncomingMessageBuilder withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    public IMIncomingMessageBuilder withCommand(boolean command) {
        this.command = command;
        return this;
    }

    public IMIncomingMessageBuilder withCommandAttributes(String commandAttributes) {
        this.commandAttributes = commandAttributes;
        return this;
    }

    public IMIncomingMessageBuilder withCommandSymbol(String commandSymbol) {
        this.commandSymbol = commandSymbol;
        return this;
    }

    public IMIncomingMessage build() {
        return new IMIncomingMessage(rawMessageBody, author, timestamp,
                botName, conference, conferenceName, command, commandName,
                commandAttributes, protocol, commandSymbol);
    }
}

