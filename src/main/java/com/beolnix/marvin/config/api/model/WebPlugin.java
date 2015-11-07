package com.beolnix.marvin.config.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by beolnix on 07/11/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WebPlugin {

    @XmlAttribute
    private String name;

    @XmlValue
    private String url;

    public WebPlugin() {}

    public WebPlugin(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return "WebPlugin{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
