package streamv3.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Minion extends Thread {

    private static final Random RANDOM = new Random();

    private Map<RobotDetails, Integer> dump;
    private Scientist scientist;

    private Night night;

    public Minion(Map<RobotDetails, Integer> dump, Scientist scientist, Night night) {
        this.dump = dump;
        this.scientist = scientist;
        this.night = night;
    }

    @Override
    public void run() {
            while (night.getNight() > 0) {
                synchronized (dump) {
                    if (dump.isEmpty()) {
                        try {
                            dump.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    List<RobotDetails> robotDetailsAtDump = new ArrayList<>(dump.keySet());
                    if (dump.size() > 0) {
                        RobotDetails robotDetails = robotDetailsAtDump.get(dump.size() - 1);
                        int randomValueDetails=1+RANDOM.nextInt(3);
                        for (int getRandomDetailsAtMinion=0;getRandomDetailsAtMinion<randomValueDetails;getRandomDetailsAtMinion++) {
                            scientist.getRobotDatails(robotDetails);
                        }
//                        try {
//                            dump.wait(10);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        Integer amountRobotDatailsAtDump = dump.get(robotDetails);
                        if (amountRobotDatailsAtDump > 1) {
                            dump.put(robotDetails, amountRobotDatailsAtDump - 1);
                            System.out.println(getName()+ "удалил число");
                        } else {
                            dump.remove(robotDetails);
                            System.out.println(getName()+"удалил ключ");
                        }
                    }
                }
            }
        }
    }