package stream.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dump extends Thread {

    private static final Random RANDOM = new Random();

    List<RobotDetails> dump;

    public Dump(List<RobotDetails> dump) {
        this.dump = dump;
    }

    @Override
    public void run() {
        int night=0;
        while (night<10) {
             if (night==0) {
                 for (int detailsAtfirstNight = 0; detailsAtfirstNight < 20; detailsAtfirstNight++) {
                     dump.add(Factory.getFactoryRandomDetails());
                     System.out.println(dump);
                     System.out.println(dump.size());
                 }
             }
             dump.add(Factory.getFactoryRandomDetails());
             for (int randomAmountFabricDetails=0; randomAmountFabricDetails<RANDOM.nextInt(3);randomAmountFabricDetails++) {
                 dump.add(Factory.getFactoryRandomDetails());
                 System.out.println(dump);
                 System.out.println(dump.size());
             }
            night++;
         }
        try {
            Thread.sleep(1000);
            synchronized (dump){
                dump.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
