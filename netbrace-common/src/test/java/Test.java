import org.netbrace.api.IBootstrap;
import org.netbrace.api.IChannelBootstrap;
import org.netbrace.api.channels.IChannel;
import org.netbrace.common.BootstrapImpl;

/**
 * this doc was created on 04.07.2022
 * This class belongs to the netbrace project
 *
 * @author Generix030
 */

public class Test {

    public Test() {

        IBootstrap bootstrap = new BootstrapImpl();
        IChannelBootstrap channelBootstrap = bootstrap.channelFactory().newChannel(IChannel.class);
        IChannel channel = channelBootstrap.open(23);

    }
}
