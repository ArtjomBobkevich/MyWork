package lesson16;

import java.util.Random;

public class RandomValue {

    private static final Random RANDOM=new Random();

    public RandomValue() {
    }

    public static int value(){
        return RANDOM.nextInt(100);
    }
}
