package streamv3.homework;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Night night =new Night(100);
        Map<RobotDetails,Integer> dump =new HashMap<>();
        Map<RobotDetails,Integer> robotByScientist1 = new HashMap<>();
        Map<RobotDetails,Integer> robotByScientist2 = new HashMap<>();
        Scientist scientist1 = new Scientist((HashMap<RobotDetails, Integer>) robotByScientist1);
        Scientist scientist2 = new Scientist((HashMap<RobotDetails, Integer>) robotByScientist2);

        Thread thread1=new Minion(dump,scientist1,night);
        Thread thread2=new Factory(dump,night);
        Thread thread3=new Minion(dump,scientist2,night);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();


        System.out.println("Детали робота у учёного №1"+robotByScientist1);
        System.out.println(robotByScientist1.size());
        System.out.println("Детали робота у учёного №2"+robotByScientist2);
        System.out.println(robotByScientist2.size());
    }
}