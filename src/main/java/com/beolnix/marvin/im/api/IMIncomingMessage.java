package com.beolnix.marvin.im.api;

import java.util.Calendar;

/**
 * Created by beolnix on 31/10/15.
 */
public class IMIncomingMessage extends IMMessage {
    private final String author;
    private final Calendar timestamp;

    private final boolean command;
    private final String commandName;
    private final String commandAttributes;
    private final String commandSymbol;

    public IMIncomingMessage(String messageBody,
                             String author,
                             Calendar timestamp,
                             String botName,
                             boolean conference,
                             String conferenceName,
                             boolean command,
                             String commandName,
                             String commandAttributes,
                             String protocol,
                             String commandSymbol) {
        super(messageBody, botName, conference, conferenceName, protocol);
        this.author = author;
        this.timestamp = timestamp;
        this.command = command;
        this.commandName = commandName;
        this.commandAttributes = commandAttributes;
        this.commandSymbol = commandSymbol;
    }

    public String getAuthor() {
        return author;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public Boolean isCommand() {
        return command;
    }

    public String getCommandName() {
        return commandName;
    }

    public String getMessageBodyWOCommand() {
        return commandAttributes;
    }

    public String getCommandAttributes() {
        return commandAttributes;
    }

    public String getCommandSymbol() {
        return commandSymbol;
    }
}
