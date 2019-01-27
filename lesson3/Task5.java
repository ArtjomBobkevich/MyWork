package lesson3;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int nextRandomValue = random.nextInt(100);
            System.out.println(nextRandomValue + ", ");
            if (nextRandomValue > maxValue) {
                maxValue = nextRandomValue;
            }
        }
        System.out.println("Max: " + maxValue);
    }
}
