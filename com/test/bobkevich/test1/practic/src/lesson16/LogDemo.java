package lesson16;

import java.util.ArrayList;
import java.util.List;

public class LogDemo {

    public static void main(String[] args) throws InterruptedException {


        List<Integer> list = new ArrayList<>();

        Thread firstThread = new BufferWriter(list);
        Thread secondThread = new BufferWriter(list);
        Thread threeThread = new BufferWriter(list);

        firstThread.start();
        secondThread.start();
        threeThread.start();

        firstThread.join();
        secondThread.join();
        threeThread.join();

    }
}
