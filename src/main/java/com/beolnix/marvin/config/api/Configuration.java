package com.beolnix.marvin.config.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by beolnix on 31/10/15.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {

    @XmlElement(name = "bot")
    private List<Bot> bots = new ArrayList<>();

    @XmlElement(required= true)
    private PluginsSettings pluginSettings;

    @Override
    public String toString() {
        return "Configuration{" +
                "bots=" + bots +
                ", pluginSettings=" + pluginSettings +
                '}';
    }

    public List<Bot> getBots() {
        return bots;
    }

    public void setBots(List<Bot> bots) {
        this.bots = bots;
    }

    public PluginsSettings getPluginSettings() {
        return pluginSettings;
    }

    public void setPluginSettings(PluginsSettings pluginSettings) {
        this.pluginSettings = pluginSettings;
    }
}
