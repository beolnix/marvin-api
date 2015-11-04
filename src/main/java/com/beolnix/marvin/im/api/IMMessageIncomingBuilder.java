package com.beolnix.marvin.im.api;

import java.util.Calendar;

/**
 * Created by DAtmakin on 11/3/2015.
 */
public class IMMessageIncomingBuilder {
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

    public IMMessageIncomingBuilder() {}

    public IMMessageIncomingBuilder withRawMessageBody(String rawMessageBody) {
        this.rawMessageBody = rawMessageBody;
        return this;
    }

    public IMMessageIncomingBuilder withBotName(String botName) {
        this.botName = botName;
        return this;
    }

    public IMMessageIncomingBuilder withConference(boolean conference) {
        this.conference = conference;
        return this;
    }

    public IMMessageIncomingBuilder withConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    public IMMessageIncomingBuilder withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public IMMessageIncomingBuilder withAutor(String autor) {
        this.author = autor;
        return this;
    }

    public IMMessageIncomingBuilder withTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public IMMessageIncomingBuilder withCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }

    public IMMessageIncomingBuilder withCommand(boolean command) {
        this.command = command;
        return this;
    }

    public IMMessageIncomingBuilder withCommandAttributes(String commandAttributes) {
        this.commandAttributes = commandAttributes;
        return this;
    }

    public IMMessageIncomingBuilder withCommandSymbol(String commandSymbol) {
        this.commandSymbol = commandSymbol;
        return this;
    }

    public IMIncomingMessage build() {
        return new IMIncomingMessage(rawMessageBody, author, timestamp,
                botName, conference, conferenceName, command, commandName,
                commandAttributes, protocol, commandSymbol);
    }
}

