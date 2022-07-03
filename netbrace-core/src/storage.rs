pub mod storage {
    use std::collections::HashMap;

    pub static mut CHANNELS: HashMap<i32, Channel> = HashMap::new();

}