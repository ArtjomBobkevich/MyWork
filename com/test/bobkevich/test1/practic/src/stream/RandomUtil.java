package stream;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int next() {
        return RANDOM.nextInt(100);
    }

    public static int next(int value) {
        return RANDOM.nextInt(value);
    }
}