package streamv3.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Minion extends Thread {

    Map<RobotDetails, Integer> dump;
    Scientist scientist;
    List<RobotDetails> robotDetailsAtDump;
    private Integer night;

    public Minion(Map<RobotDetails, Integer> dump, List<RobotDetails> robotDetailsAtDump, Scientist scientist, Integer night) {
        this.dump = dump;
        this.robotDetailsAtDump = robotDetailsAtDump;
        this.scientist = scientist;
        this.night = night;
    }

    @Override
    public void run() {
//        synchronized (night) {
            while (night > 0) {
                synchronized (dump) {
                    if (dump.isEmpty()) {
                        try {
                            dump.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    robotDetailsAtDump = new ArrayList<>(dump.keySet());
                    if (dump.size() > 0) {
                        RobotDetails robotDetails = robotDetailsAtDump.get(dump.size() - 1);
                        Integer amountRobotDatailsAtDump = dump.get(robotDetails);
                        scientist.getRobotDatails(robotDetails);
                        if (amountRobotDatailsAtDump > 1) {
                            dump.put(robotDetails, amountRobotDatailsAtDump - 1);
                            System.out.println(getName() + "remove Value");
                        } else {
                            dump.remove(robotDetails);
                            System.out.println(getName() + "remove");
                        }
                    }
                    dump.notifyAll();
                }
                night--;
            }
        }
    }
//}