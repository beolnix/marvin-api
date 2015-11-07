package com.beolnix.marvin.config.api.model;

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

    @XmlElement(name = "webPlugin")
    private List<WebPlugin> webPlugins = new ArrayList<>();

    @Override
    public String toString() {
        return "Configuration{" +
                "bots=" + bots +
                ", pluginSettings=" + pluginSettings +
                ", webPlugins=" + webPlugins +
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

    public List<WebPlugin> getWebPlugins() {
        return webPlugins;
    }

    public void setWebPlugins(List<WebPlugin> webPlugins) {
        this.webPlugins = webPlugins;
    }
}
