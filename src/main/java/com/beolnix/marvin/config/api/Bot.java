package com.beolnix.marvin.config.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by beolnix on 31/10/15.
 */


@XmlAccessorType(XmlAccessType.FIELD)
public class Bot implements BotSettings {

    @XmlAttribute(required = true)
    private String protocol;

    @XmlAttribute(required = true)
    private String name;

    @XmlElement(name = "property")
    private List<Property> properties = new ArrayList<>();

    @Override
    public String toString() {
        return "Bot{" +
                "protocol='" + protocol + '\'' +
                ", name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }

    @Override
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
