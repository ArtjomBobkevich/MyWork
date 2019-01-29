package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int[] value = {rand(), rand(), rand(), rand()};
        System.out.println(Arrays.toString(value));
        System.out.println(isOk(value));
    }

    public static boolean isOk(int[] value) {
        boolean result = true;
        for (int i = 1; i < value.length; i++) {
            if (value[i] < value[i - 1]) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static int rand() {
        return new Random().nextInt(90) + 10;
    }
}
