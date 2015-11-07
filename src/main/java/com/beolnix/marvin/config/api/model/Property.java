package com.beolnix.marvin.config.api.model;

import javax.xml.bind.annotation.*;

/**
 * Created by beolnix on 31/10/15.
 */
@XmlAccessorType( XmlAccessType.FIELD )
public class Property {

    @XmlAttribute
    private String name;

    @XmlValue
    private String value;

    public Property() {}

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
