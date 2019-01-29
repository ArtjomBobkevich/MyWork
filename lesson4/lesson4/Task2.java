package lesson4;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        final int arraySize = 100;
        int[] value = new int[arraySize];

        fillArray(value);
        Arrays.sort(value);
        System.out.println(Arrays.toString(value));
    }

    public static void fillArray(int... value) {
        int counter = 0;
        int currentValue = 1;
        while (counter < value.length) {
            value[counter++] = currentValue * 13;
            if (counter < value.length) {
                value[counter++] = currentValue * 17;
            }
            currentValue++;
        }
    }

    private static void firstCase() {
        int[] value = new int[100];
        int counter = 0;
        int currentValue = 1;
        while (counter < 100) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0) {
                value[counter++] = currentValue;
            }
            currentValue++;
        }
        System.out.println(Arrays.toString(value));
    }
}
