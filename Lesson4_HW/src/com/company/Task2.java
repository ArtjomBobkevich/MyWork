package com.company;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = {7, 2, 3, 1, 4, 2, 1, 6, 7, 1, 8, 9};
        deleteValue(mas);
    }


    public static void deleteValue(int[] mas) {
        int valueMas;
        for (int i = 0; i < mas.length; i++) {
            valueMas = mas[i];
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    valueMas = 0;
                }
            }
            System.out.print(valueMas + " ");
        }
    }
}



