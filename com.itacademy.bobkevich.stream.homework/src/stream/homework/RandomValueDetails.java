package stream.homework;

import java.util.Random;

public class RandomValueDetails {

    private static final Random RANDOM = new Random();

    public RandomValueDetails() {
    }


    public static int next() {
        return RANDOM.nextInt(4);
    }
}
