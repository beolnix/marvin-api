package com.beolnix.marvin.config.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by beolnix on 17/01/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PluginConfig {
    @XmlAttribute(required = true)
    private String name;

    @XmlElement(name = "property")
    private List<Property> properties = new ArrayList<>();

    @Override
    public String toString() {
        return "PluginConfig{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
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
