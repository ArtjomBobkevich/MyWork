package streamv3.homework;

import java.util.*;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Map<RobotDetails,Integer> dump =new HashMap<>();
        List<RobotDetails> robotDetailsAtMinion=new ArrayList<>();
        List<RobotDetails> robotDetailsAtMinion2=new ArrayList<>();
        Scientist scientist1 = new Scientist();
        Scientist scientist2 = new Scientist();

        Thread thread1=new Minion(dump,robotDetailsAtMinion,scientist1,10);
        Thread thread2=new Factory(dump,10);
        Thread thread3=new Minion(dump,robotDetailsAtMinion2,scientist2,10);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(scientist1);
        System.out.println(scientist2);

    }
}