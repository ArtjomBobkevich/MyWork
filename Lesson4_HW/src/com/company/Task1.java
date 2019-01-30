package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(mas));
        //      shiftMasOnLeft(mas);
        shiftMasOnRight(mas);
    }


    public static void shiftMasOnLeft(int[] mas) {
        int indexMas = mas[0];
        for (int i = 0; i < mas.length - 1; i++) {
            mas[i] = mas[i + 1];
        }
        mas[mas.length - 1] = indexMas;
        System.out.println(Arrays.toString(mas));
    }

    public static void shiftMasOnRight(int[] mas) {
        int indexMas = mas[mas.length - 1];
        for (int i = mas.length - 1; i >= 0; i--) {
            if (mas[i] == mas[0]) {
                break;
            }
            mas[i] = mas[i - 1];
        }
        mas[0] = indexMas;
        System.out.println(Arrays.toString(mas));
    }
}
