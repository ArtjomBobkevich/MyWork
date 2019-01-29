package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas1 = {random(), random(), random(), random(), random(), random(), random(), random()};
        int[] mas2 = {random(), random(), random(), random(), random(), random()};
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        functionOfMassiv(mas1, mas2);


    }


    public static void functionOfMassiv(int[] mas1, int[] mas2) {
        int[] mas3 = new int[mas1.length + mas2.length];
        int indexA = 0;
        int indexB = 0;

        for (int i = 0; i < mas3.length; ) {
            if (indexA != mas1.length) {
                mas3[i] = mas1[indexA];
                indexA++;
                i++;
            }
            if (indexB != mas2.length) {
                mas3[i] = mas2[indexB];
                indexB++;
                i++;
            }
        }
        System.out.println(Arrays.toString(mas3));
    }

    public static int random() {
        return new Random().nextInt(100);
    }
}




