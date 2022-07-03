package org.netbrace.common;

import org.netbrace.api.IBootstrap;
import org.netbrace.api.channels.IChannel;
import org.netbrace.api.factory.IChannelFactory;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class ChannelFactoryImpl implements IChannelFactory {
    private final IBootstrap _bootstrap;

    public ChannelFactoryImpl(IBootstrap bootstrap) {
        _bootstrap = bootstrap;
    }

    public IChannel newChannel() {
        return null;
    }

    public IChannel newChannel(Class<? extends IChannel> type) {
        return null;
    }

    public IChannel from(int snowflake) {
        return null;
    }

    public IBootstrap bootstrap() {
        return this._bootstrap;
    }
}
