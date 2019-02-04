package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
 //     System.out.println(Arrays.toString(shiftArrayOnLeft(array)))
        System.out.println(Arrays.toString(shiftArrayOnRight(array)));
    }

    public static int [] shiftArrayOnLeft(int[] array) {
        int indexOfMassiv = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = indexOfMassiv;
        return array;
    }

    public static int [] shiftArrayOnRight(int[] array) {
        int indexOfMassiv = array[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == array[0]) {
                break;
            }
            array[i] = array[i - 1];
        }
        array[0] = indexOfMassiv;
        return array;
    }
}
