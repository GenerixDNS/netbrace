pub mod pipeline {

    pub struct ChannelPipeline(Channel, Vec<ChannelHandler>);

    pub trait IChannelPipeline {

        fn add_last_handler(self, _handler: ChannelHandler) -> ChannelHandler;

        fn remove_handle(self, _index: i32);

        fn len(self) -> i32;

    }

    pub struct ChannelHandler {

        handler: fn(channel: Channel, ChannelHandlerContext<String>)

    }

    impl IChannelPipeline for ChannelPipeline {

        fn add_last_handler(self, _handler: ChannelHandler) -> ChannelHandler {
            return _handler;
        }

        fn remove_handle(mut self, _index: i32) {
            self.1.remove(_index as usize);
        }

        fn len(self) -> i32 {
            return self.1.len() as i32;
        }
    }

    impl ChannelHandler {

        pub fn new(_handler: fn(channel: Channel, ChannelHandlerContext<String>)) -> ChannelHandler {
            let _channel_handler = ChannelHandler {
                handler: _handler
            };
            return _channel_handler;
        }

    }

    impl ChannelPipeline {

        pub fn default(c: Channel) -> ChannelPipeline {
            return ChannelPipeline {
                0: c,
                1: Vec::new()
            }
        }

    }

    pub struct ChannelHandlerContext<T>(Vec<T>);

}