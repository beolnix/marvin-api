package com.beolnix.marvin.config.api;

import java.util.List;

/**
 * Created by beolnix on 01/11/15.
 */
public interface BotSettings {
    String getProtocol();
    String getName();
    List<Property> getProperties();
}
