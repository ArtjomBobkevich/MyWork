package stream.homework;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        List<RobotDetails> deatils = new ArrayList<>();
        Thread firstThread= new Dump(deatils);
        Thread secondthread= new Minion(deatils);

        firstThread.start();
        secondthread.start();

        firstThread.join();
        secondthread.join();
    }
}
