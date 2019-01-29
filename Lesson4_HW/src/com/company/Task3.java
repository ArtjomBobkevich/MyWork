package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas1 = {1, 3, 5, 7, 9, 11};
        int[] mas2 = {2, 4, 6, 8, 10, 12, 13, 14, 15};
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        massiv(mas1, mas2);
    }


    public static void massiv(int[] value1, int[] value2) {
        if (value1.length > value2.length) {
            for (int i = 0; i < value1.length; i++) {
                for (int j = i; j < value2.length; ) {
                    System.out.print(" " + value1[i] + " " + value2[j]);
                    break;
                }
                while (i >= value2.length) {
                    System.out.print(" " + value1[i]);
                    break;
                }
            }
        } else
            for (int i = 0; i < value2.length; i++) {
                for (int j = i; j < value1.length; ) {
                    System.out.print(" " + value1[i] + " " + value2[j]);
                    break;
                }
                while (i >= value1.length) {
                    System.out.print(" " + value2[i]);
                    break;

                }
            }
    }
}



