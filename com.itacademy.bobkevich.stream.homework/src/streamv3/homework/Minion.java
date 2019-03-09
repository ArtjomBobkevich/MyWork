package streamv3.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Minion extends Thread {

    private static final Random RANDOM = new Random();

    private Dump dump;
    private Scientist scientist;
    private Night night;
    private Map<RobotDetails, Integer> robotDatilsAtMinionHand = new HashMap<>();

    public Minion(Dump dump, Scientist scientist, Night night) {
        this.dump = dump;
        this.scientist = scientist;
        this.night = night;
    }

    @Override
    public void run() {
        while (night.getNight() > 0) {
            synchronized (dump) {
                if (dump.getDump().size() > 0) {
                    int randomValueDetails = 1 + RANDOM.nextInt(4);
                    for (int counter = 0; counter < randomValueDetails; counter++) {
                        List<RobotDetails> allRobotDatailsOnDump = new ArrayList<>(dump.getDump().keySet());
                        if (allRobotDatailsOnDump.size() > 0) {
                            RobotDetails thisRobotDetailsOnDump = allRobotDatailsOnDump.get(RANDOM.nextInt(dump.getDump().size()));
                            if (!this.robotDatilsAtMinionHand.containsKey(thisRobotDetailsOnDump)) {
                                this.robotDatilsAtMinionHand.put(thisRobotDetailsOnDump, 1);
                                dump.takeRobotDatailsOnDump(thisRobotDetailsOnDump);
                            } else {
                                this.robotDatilsAtMinionHand.put(thisRobotDetailsOnDump, robotDatilsAtMinionHand.get(thisRobotDetailsOnDump) + 1);
                                dump.takeRobotDatailsOnDump(thisRobotDetailsOnDump);
                            }
                            scientist.getRobotDatails(robotDatilsAtMinionHand);
                            robotDatilsAtMinionHand.clear();
                        }
                    }
                }
                try {
                    dump.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}