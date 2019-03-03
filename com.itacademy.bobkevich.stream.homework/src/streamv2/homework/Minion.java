//package streamv2.homework;
//
//import java.util.List;
//
//public class Minion extends Thread {
//
//    Dump dump1;
//    List<RobotDetails> dump;
//
//    public Minion(Dump dump1, List<RobotDetails> dump) {
//        this.dump1 = dump1;
//        this.dump = dump;
//    }
//
//    @Override
//    public void run() {
//        int night=0;
//        while (night<100) {
//            try {
//                dump1.getRobotDetails();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            night++;
//        }
//    }
//}