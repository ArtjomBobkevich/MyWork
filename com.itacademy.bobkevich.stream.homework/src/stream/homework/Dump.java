package stream.homework;

import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;

public class Dump {

    BlockingDeque<RobotDetails> dump;

    public Dump(BlockingDeque<RobotDetails> dump) {
        this.dump = dump;
    }
}
