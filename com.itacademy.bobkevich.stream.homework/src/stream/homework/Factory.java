package stream.homework;

import java.util.Random;

public class Factory {

    private static final Random RANDOM = new Random();

    public Factory() {
    }

    public static int factoryRandomDetails () {
        return RANDOM.nextInt();
    }
}
