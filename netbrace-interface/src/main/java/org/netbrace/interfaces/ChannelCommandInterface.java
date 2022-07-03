package org.netbrace.interfaces;

/**
 *
 * This class belongs to the netbrace project
 * in this interface, primitive commands are communicated to the channel.
 *
 * @author Generix030
 * @since NBV 1.0
 *
 */

public class ChannelCommandInterface {

    /**
     *
     * tries to open a channel at the unique id.
     * this method is executed natively in rust.
     *
     * @param snowflake channel unique id
     * @return whether the process was successful.
     */
    public static native boolean open(int snowflake);

    /**
     *
     * tries to close a channel at the unique id.
     * this method is executed natively in rust.
     *
     * @param snowflake channel unique id
     * @return whether the process was successful.
     */
    public static native boolean close(int snowflake);

}
