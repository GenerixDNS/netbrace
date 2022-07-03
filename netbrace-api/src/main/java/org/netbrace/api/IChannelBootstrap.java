package org.netbrace.api;

import org.netbrace.api.channels.IChannel;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public interface IChannelBootstrap {

    Class<? extends IChannel> type();

    IChannelBootstrap waitFuture();

    IChannelPipeline pipeline();

    IChannel open(int port, String host);

    IChannel open(int port);

}
