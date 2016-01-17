package com.beolnix.marvin.config.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by beolnix on 31/10/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "managerPassword",
        "libsPath",
        "systemDeployPath",
        "pluginsDeployPath",
        "cachePath",
        "tmpPath",
        "logsPath",
        "dirPath",
        "pollPeriod"})
public class PluginsSettings {
    private String managerPassword;
    private String libsPath;
    private String systemDeployPath;
    private String pluginsDeployPath;
    private String cachePath;
    private String tmpPath;
    private String logsPath;
    private String dirPath;
    private Integer pollPeriod;

    @XmlElement(name = "plugin")
    private List<Plugin> plugins = new ArrayList<>();
    

    @Override
    public String toString() {
        return "PluginsSettings{" +
                "managerPassword='" + managerPassword + '\'' +
                ", libsPath='" + libsPath + '\'' +
                ", systemDeployPath='" + systemDeployPath + '\'' +
                ", pluginsDeployPath='" + pluginsDeployPath + '\'' +
                ", cachePath='" + cachePath + '\'' +
                ", tmpPath='" + tmpPath + '\'' +
                ", logsPath='" + logsPath + '\'' +
                ", dirPath='" + dirPath + '\'' +
                ", pollPeriod='" + pollPeriod + '\'' +
                '}';
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getLibsPath() {
        return libsPath;
    }

    public void setLibsPath(String libsPath) {
        this.libsPath = libsPath;
    }

    public String getSystemDeployPath() {
        return systemDeployPath;
    }

    public void setSystemDeployPath(String systemDeployPath) {
        this.systemDeployPath = systemDeployPath;
    }

    public String getPluginsDeployPath() {
        return pluginsDeployPath;
    }

    public void setPluginsDeployPath(String pluginsDeployPath) {
        this.pluginsDeployPath = pluginsDeployPath;
    }

    public String getCachePath() {
        return cachePath;
    }

    public void setCachePath(String cachePath) {
        this.cachePath = cachePath;
    }

    public String getTmpPath() {
        return tmpPath;
    }

    public void setTmpPath(String tmpPath) {
        this.tmpPath = tmpPath;
    }

    public String getLogsPath() {
        return logsPath;
    }

    public void setLogsPath(String logsPath) {
        this.logsPath = logsPath;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Integer getPollPeriod() {
        return pollPeriod;
    }

    public void setPollPeriod(Integer pollPeriod) {
        this.pollPeriod = pollPeriod;
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }
}

