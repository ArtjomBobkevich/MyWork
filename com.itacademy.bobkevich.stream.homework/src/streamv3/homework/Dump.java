package streamv3.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dump extends Thread {

    private Map<RobotDetails,Integer>gabrigeDump =new HashMap<>();

    public Dump() {
    }

    public void discardRobotDatailsOnDump(RobotDetails robotDetails) {     /*для фабрики*/
            if (gabrigeDump.containsKey(robotDetails)) {
                gabrigeDump.put(robotDetails, gabrigeDump.get(robotDetails) + 1);
            } else {
                gabrigeDump.put(robotDetails, 1);
            }
    }

    public void takeRobotDatailsOnDump (RobotDetails robotDetails){   /*для миньонов*/
            if (gabrigeDump.containsKey(robotDetails)) {
                gabrigeDump.put(robotDetails, gabrigeDump.get(robotDetails) - 1);
            } else {
                gabrigeDump.remove(robotDetails);
            }
    }

    public synchronized Map<RobotDetails, Integer> getGabrigeDump() {
        return this.gabrigeDump;
    }
}
