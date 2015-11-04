package com.beolnix.marvin.plugins.api;

/**
 * Created by beolnix on 31/10/15.
 */
public interface PluginsListener {
    void deployPlugin(IMPlugin imPlugin);

    void undeployPlugin(IMPlugin imPlugin);

}
