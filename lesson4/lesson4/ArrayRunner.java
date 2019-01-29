package lesson4;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {

    public static void main(String[] args) {
        int[][] value = new int[3][];
        value[0] = new int[]{3, 2};
        value[1] = new int[]{10};
        value[2] = new int[]{5, 12, 99, 6, 7};
        System.out.println(value[2][2]);

        for (int i = 0; i < value.length; i++) {
//            System.out.println(Arrays.toString(value[i]));
            System.out.print(value[i] + ": ");
            for (int j = 0; j < value[i].length; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void test2() {
        //        int[] value = new int[5];
//        int[] value = new int[]{1, 2, 3, 4, 5};
        int[] value = {1, 2, 3, 4, 5};
        printArray(value);

        System.out.println(Arrays.toString(value));
    }

    public static int getRandomValue(int size) {
        return new Random().nextInt(size);
    }

    public static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + 1;
            System.out.print(source[i] + ", ");
        }
        System.out.println();
    }
}
