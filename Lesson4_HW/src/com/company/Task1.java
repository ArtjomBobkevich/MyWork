package com.company;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shiftArrayOnRight(array)));
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
