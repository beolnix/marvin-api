package com.beolnix.marvin.config.api;

import com.beolnix.marvin.config.api.model.Property;

import java.util.List;

/**
 * Basic interface for work with bot settings
 * Created by beolnix on 01/11/15.
 */
public interface BotSettings {

    /**
     * Returns bot's protocol
     * @return
     */
    String getProtocol();

    /**
     * Returns bot's name. The name must be unique
     * @return
     */
    String getName();

    /**
     * Returns all properties provided in config for the bot
     * @return
     */
    List<Property> getProperties();
}
