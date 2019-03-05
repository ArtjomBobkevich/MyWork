package streamv3.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Minion extends Thread {

    private static final Random RANDOM = new Random();

    private Dump gabrigeDump;
    private Scientist scientist;
    private Night night;
    private Map<RobotDetails,Integer> robotDatilsAtMinionHand=new HashMap<>();

    public Minion(Dump gabrigeDump, Scientist scientist, Night night) {
        this.gabrigeDump = gabrigeDump;
        this.scientist = scientist;
        this.night = night;
    }

    @Override
    public void run() {
        while (night.getNight() > 0) {
            synchronized (gabrigeDump) {
                if (gabrigeDump.getGabrigeDump().size() > 0) {
                    int randomValueDetails = 1 + RANDOM.nextInt(4);
                    for (int getRandomDetailsAtMinion = 0; getRandomDetailsAtMinion < randomValueDetails; getRandomDetailsAtMinion++) {
                        List<RobotDetails> allRobotDatailsOnDump =new ArrayList<>(gabrigeDump.getGabrigeDump().keySet());   /*перевёл все ключи в мапе в лист*/
                        RobotDetails robotDetailsOnDump=allRobotDatailsOnDump.get(gabrigeDump.getGabrigeDump().size()-1);   /* выбираю деталь робота по листу */
                        if (!this.robotDatilsAtMinionHand.containsKey(robotDetailsOnDump)) {
                            this.robotDatilsAtMinionHand.put(robotDetailsOnDump, 1);
                            gabrigeDump.takeRobotDatailsOnDump(robotDetailsOnDump);  /*стираю либо деталь полностью, */
                        }else {
                            this.robotDatilsAtMinionHand.put(robotDetailsOnDump,robotDatilsAtMinionHand.get(robotDetailsOnDump)-1); /* либо отнимаю её значение */
                            gabrigeDump.takeRobotDatailsOnDump(robotDetailsOnDump);
                        }
                        scientist.getRobotDatails(robotDatilsAtMinionHand);  /*передаёт мапу деталей миньона, мапе учёного*/
                        robotDatilsAtMinionHand.clear();  /*по условию миньон приносит и отдаёт, следовательно его лист я чищу*/
                    }
                    try {
                        gabrigeDump.wait();     /*после того как миньон принёс всё он ждёт следующей ночи*/
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {                           /*пришёл раньше, чем фабрика скинула детали, ушёл нисчем до следующей ночи*/
                    gabrigeDump.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
//public class Minion extends Thread {
//
//    private static final Random RANDOM = new Random();
//
//    private Map<RobotDetails, Integer> dump;
//    private Scientist scientist;
//    private Map<RobotDetails, Integer> robotDatilsAtMinionHand = new HashMap<>();
//    private Night night;
//
//    public Minion(Map<RobotDetails, Integer> dump, Scientist scientist, Night night) {
//        this.dump = dump;
//        this.scientist = scientist;
//        this.night = night;
//    }
//
//    @Override
//    public void run() {
//        while (night.getNight() > 0) {
//            synchronized (dump) {
//                if (!dump.isEmpty()) {
//                    int randomValueDetails = 1 + RANDOM.nextInt(4);
//                    for (int getRandomDetailsAtMinion = 0; getRandomDetailsAtMinion < randomValueDetails; getRandomDetailsAtMinion++) {
//                        List<RobotDetails> allRobotDatailsOnDump = new ArrayList<>(dump.keySet());
//                        RobotDetails robotDetailsOnDump = allRobotDatailsOnDump.get(dump.size() - 1);
//                        Integer amountRobotDatailsAtDump = dump.get(robotDetailsOnDump);
//                        if (!this.robotDatilsAtMinionHand.containsKey(robotDetailsOnDump)) {
//                            this.robotDatilsAtMinionHand.put(robotDetailsOnDump, 1);
//                            if (amountRobotDatailsAtDump > 1) {
//                                dump.put(robotDetailsOnDump, amountRobotDatailsAtDump - 1);
//                                System.out.println(getName() + "удалил число");
//                            } else {
//                                dump.remove(robotDetailsOnDump);
//                                System.out.println(getName() + "удалил ключ");
//                            }
//                        } else {
//                            this.robotDatilsAtMinionHand.put(robotDetailsOnDump, robotDatilsAtMinionHand.get(robotDetailsOnDump) - 1);
//                            if (amountRobotDatailsAtDump > 1) {
//                                dump.put(robotDetailsOnDump, amountRobotDatailsAtDump - 1);
//                                System.out.println(getName() + "удалил число");
//                            } else {
//                                dump.remove(robotDetailsOnDump);
//                                System.out.println(getName() + "удалил ключ");
//                            }
//                        }
//                        scientist.getRobotDatails(robotDatilsAtMinionHand);
//
////                        try {
////                            dump.wait();
////                        } catch (InterruptedException e) {
////                            e.printStackTrace();
////                        }
//                    }
////                    try {
////                        dump.wait();
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//                }
//            }
//        }
//    }
//}

