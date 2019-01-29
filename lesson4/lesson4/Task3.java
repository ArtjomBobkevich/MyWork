package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] value = new int[10];
        for (int i = 0; i < value.length; i++) {
            value[i] = random.nextInt(10) + 1;
        }

        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] < value[minIndex]) {
                minIndex = i;
            }
            if (value[i] > value[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(value));
        System.out.println("Max: " + value[maxIndex]);
        System.out.println("Min: " + value[minIndex]);

        int startIndex = minIndex < maxIndex ? minIndex : maxIndex;
        int endIndex = minIndex < maxIndex ? maxIndex : minIndex;
        int sum = 0;
        for (int i = startIndex + 1; i < endIndex; i++) {
            sum += value[i];
        }
        System.out.println("Sum: " + sum);
    }
}
