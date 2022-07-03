package org.netbrace.common;

import org.netbrace.api.IChannelBootstrap;
import org.netbrace.api.IChannelPipeline;
import org.netbrace.api.channels.IChannel;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

@SuppressWarnings("FieldCanBeLocal")
public class ChannelBootstrapImpl implements IChannelBootstrap {
    private final Class<? extends IChannel> _channel;
    private boolean _wait = false;
    private final IChannelPipeline _pipeline = new ChannelPipelineImpl(this);
    private IChannel _future_channel;
    public ChannelBootstrapImpl(Class<? extends IChannel> channel) {
        _channel = channel;
    }

    public Class<? extends IChannel> type() {
        return this._channel;
    }

    public IChannelBootstrap waitFuture() {
        this._wait = true;
        return this;
    }

    public IChannelPipeline pipeline() {
        return this._pipeline;
    }

    public IChannel open(int port, String host) {
        if (this._channel.equals(IChannel.class)) {
            this._future_channel = new ChannelImpl(0, host, port);
        }
        return this._future_channel;
    }

    public IChannel open(int port) {
        if (this._channel.equals(IChannel.class)) {
            this._future_channel = new ChannelImpl(0, "-1", port);
        }
        return this._future_channel;
    }
}
