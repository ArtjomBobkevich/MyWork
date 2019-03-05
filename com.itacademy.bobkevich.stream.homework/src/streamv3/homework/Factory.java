package streamv3.homework;

import java.util.Random;

public class Factory extends Thread {

    private static final Random RANDOM = new Random();
    private static final Integer AMOUNT_NIGHT=100;

    private Dump gabrigeDump;
    private Night night;

    public Factory(Dump gabrigeDump,Night night) {
        this.gabrigeDump = gabrigeDump;
        this.night=night;
    }

    @Override
    public void run() {
            while (night.getNight() > 0) {
                synchronized (gabrigeDump) {
                int randomValue = 1 + RANDOM.nextInt(4);
                if (night.getNight() - AMOUNT_NIGHT == 0) {
                    randomValue = randomValue + 20;
                }
                for (int i = 0; i <= randomValue; i++) {
                    RobotDetails robotDetails = RandomRobotDetails.getRandomDetails();
                    gabrigeDump.discardRobotDatailsOnDump(robotDetails);
                }
                try {
                    gabrigeDump.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    gabrigeDump.notifyAll();
                night.setNight(1);
            }
        }
    }
}

//package streamv3.homework;
//
//import java.util.Map;
//import java.util.Random;
//
//public class Factory extends Thread {
//
//    private static final Random RANDOM = new Random();
//    private static final Integer AMOUNT_NIGHT=100;
//
//    private Map<RobotDetails, Integer> dump;
//    private Night night;
//
//    public Factory(Map<RobotDetails, Integer> dump, Night night) {
//        this.dump = dump;
//        this.night = night;
//    }
//
//    @Override
//    public void run() {
//        synchronized (dump) {
//            while (night.getNight() >0) {
//
//                int randomValue = 1 + RANDOM.nextInt(3);
//                if (night.getNight() - AMOUNT_NIGHT == 0) {
//                    randomValue = randomValue + 20;
//                }
//                for (int i = 0; i < randomValue; i++) {
//                    int amountThisRobotDetails = 1;
//                    RobotDetails robotDetails = RandomRobotDetails.getRandomDetails();
//                    if (dump.containsKey(robotDetails)) {
//                        int oldAmountThisRobotDetails = dump.get(robotDetails);
//                        dump.put(robotDetails, oldAmountThisRobotDetails + amountThisRobotDetails);
//                        System.out.println("add");
//                    } else {
//                        dump.put(robotDetails, amountThisRobotDetails);
//                        System.out.println("add");
//                    }
//                }
//                try {
//                    dump.wait(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                dump.notifyAll();
//
//                night.setNight(1);
//            }
//        }
//    }
//}

