/**
 *
 * This class belongs to the netbrace project
 *
 * @author Generix030
 * @since NBV 1.0
 *
 */
pub mod channel {
    use storage::storage::CHANNELS;
    use crate::storage;

    /**
     *
     * default channel struct
     *
     * 0 - channel snowflake
     * 1 - channel type
     *
     */
    #[derive(Clone, Copy)]
    pub struct Channel(i32, bool);

    /**
     *
     * channel interface
     *
     */
    pub trait IChannel {

        fn write_payload() -> dyn IChannel;

        fn flush_payload() -> dyn IChannel;

        fn clear_payload() -> dyn IChannel;

    }

    impl Channel {

        pub unsafe fn default() -> Channel {
            let size: usize = CHANNELS.len();
            let channel: Channel = Channel {
                0: (size + 1) as i32,
                1: true
            };
            CHANNELS.insert(channel.0, channel);
            drop(size);
            return channel;
        }

    }

}