package streamv3.homework;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Night night = new Night(100);
        Dump dump = new Dump();
        Map<RobotDetails, Integer> robotByScientist1 = new HashMap<>();
        Map<RobotDetails, Integer> robotByScientist2 = new HashMap<>();
        Scientist scientist1 = new Scientist(robotByScientist1);
        Scientist scientist2 = new Scientist(robotByScientist2);
        Winner winner = new Winner(scientist1, scientist2);

        Thread thread2 = new Minion(dump, scientist1, night);
        Thread thread1 = new Factory(dump, night);
        Thread thread3 = new Minion(dump, scientist2, night);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Учёный №1 победил? " + winner.whoIsWinner());
    }
}