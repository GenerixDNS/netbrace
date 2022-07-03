package org.netbrace.api;

import org.netbrace.api.channels.IChannel;
import org.netbrace.api.factory.IChannelFactory;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public interface IBootstrap {

    IChannelFactory channelFactory();

}
