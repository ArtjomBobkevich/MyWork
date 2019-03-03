package streamv3.homework;


import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Map;
import java.util.Random;

public class Factory extends Thread {

    private static final Random RANDOM = new Random();

    Map<RobotDetails, Integer> dump;
    private Integer night;

    public Factory(Map<RobotDetails, Integer> dump, Integer night) {
        this.dump = dump;
        this.night = night;
    }

    @Override
    public void run() {
//        synchronized (night) {
            while (night > 0) {
                synchronized (dump) {
                    int randomValue = 1 + RANDOM.nextInt(4);
                    if (dump.size() > randomValue) {
                        try {
                            dump.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    for (int i = 0; i < randomValue; i++) {
                        int amountThisRobotDetails = 1;
                        RobotDetails robotDetails = RandomRobotDetails.getRandomDetails();
                        if (dump.containsKey(robotDetails)) {
                            int oldAmountThisRobotDetails = dump.get(robotDetails);
                            dump.put(robotDetails, oldAmountThisRobotDetails + amountThisRobotDetails);
                            System.out.println("add");
                        } else {
                            dump.put(robotDetails, amountThisRobotDetails);
                            System.out.println("add");
                        }
                    }
                    dump.notifyAll();
                    try {
                        dump.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                night--;
            }
//        }
    }
}
