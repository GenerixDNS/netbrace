package org.netbrace.common;

import org.netbrace.api.channels.IChannel;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class ChannelImpl implements IChannel {
    private final int _snowflake;
    private final String _host;
    private final int _port;

    public ChannelImpl(int snowflake, String host, int port) {
        this._snowflake = snowflake;
        this._host = host;
        this._port = port;
    }

    public int snowflake() {
        return this._snowflake;
    }

    public String host() {
        return this._host;
    }

    public int port() {
        return this._port;
    }
}
