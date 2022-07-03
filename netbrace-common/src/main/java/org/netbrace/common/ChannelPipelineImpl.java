package org.netbrace.common;

import org.netbrace.api.IChannelBootstrap;
import org.netbrace.api.IChannelPipeline;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class ChannelPipelineImpl implements IChannelPipeline {
    private final IChannelBootstrap _bootstrap;

    public ChannelPipelineImpl(IChannelBootstrap bootstrap) {
        _bootstrap = bootstrap;
    }

    public IChannelBootstrap bootstrap() {
        return this._bootstrap;
    }
}
