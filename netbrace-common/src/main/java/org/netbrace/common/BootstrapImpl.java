package org.netbrace.common;

import org.netbrace.api.IBootstrap;
import org.netbrace.api.factory.IChannelFactory;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class BootstrapImpl implements IBootstrap {
    private final IChannelFactory channelFactory = new ChannelFactoryImpl(this);

    public IChannelFactory channelFactory() {
        return this.channelFactory;
    }
}
