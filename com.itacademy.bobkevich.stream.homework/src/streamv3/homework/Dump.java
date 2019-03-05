package streamv3.homework;

import java.util.HashMap;
import java.util.Map;

public class Dump extends Thread {

    private Map<RobotDetails, Integer> dump = new HashMap<>();

    public Dump() {
    }

    public void discardRobotDatailsOnDump(RobotDetails robotDetails) {
        if (this.dump.containsKey(robotDetails)) {
            this.dump.put(robotDetails, this.dump.get(robotDetails) + 1);
        } else {
            this.dump.put(robotDetails, 1);
        }
    }

    public void takeRobotDatailsOnDump(RobotDetails robotDetails) {
        if (this.dump.containsKey(robotDetails)) {
            this.dump.put(robotDetails, this.dump.get(robotDetails) - 1);
        } else {
            this.dump.remove(robotDetails);
        }
    }

    public synchronized Map<RobotDetails, Integer> getDump() {
        return this.dump;
    }
}
