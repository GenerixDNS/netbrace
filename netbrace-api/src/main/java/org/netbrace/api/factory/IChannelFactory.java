package org.netbrace.api.factory;

import org.netbrace.api.IBootstrap;
import org.netbrace.api.IChannelBootstrap;
import org.netbrace.api.channels.IChannel;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public interface IChannelFactory {

    IChannelBootstrap newChannel();

    IChannelBootstrap newChannel(Class<? extends IChannel> type);

    IChannel from(int snowflake);

    IBootstrap bootstrap();

}
