//package streamv2.homework;
//
//import java.util.List;
//
//public class Factory extends Thread {
//
//    Dump dump1;
//    List<RobotDetails> dump;
//
//    public Factory(Dump dump1, List<RobotDetails> dump) {
//        this.dump1 = dump1;
//        this.dump = dump;
//    }
//
//    @Override
//    public void run() {
//        int night =0;
//        while (night<100) {
//            if (night==0){
//                for (int detailsAtFirstNight=0;detailsAtFirstNight<20;detailsAtFirstNight++){
//                    try {
//                        dump1.putRobotDetails();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                night++;
//            }
//            try {
//                dump1.putRobotDetails();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            night++;
//        }
//    }
//}
