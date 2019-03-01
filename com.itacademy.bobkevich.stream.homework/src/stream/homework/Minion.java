package stream.homework;

import java.util.List;

public class Minion extends Thread {

    List<RobotDetails> dump;

    public Minion(List<RobotDetails> dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        while (dump.size() != 0) {
            dump.toArray();
            System.out.println("Minion size" + dump.size());
        }
    }
}
