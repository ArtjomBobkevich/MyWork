package com.company;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] twoMas = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9,10 ,11 ,12},
                {13, 14},
                {15}};
        System.out.println(Arrays.toString(massiv(twoMas)));

    }

    public static int[] massiv(int[][] mas) {

        int lenghtMas = 0;
        int lengthMassiv = 0;
        int value = 0;
        for (int i = 0; i < mas.length; i++) {
            lenghtMas = mas[i].length;
            lengthMassiv += lenghtMas;
        }
        int[] massiv = new int[lengthMassiv];
        for (int i = 0; i < massiv.length; ) {
            for (int j = 0; j < mas.length; j++) {
                for (int k = 0; k < mas[j].length; k++) {
                    massiv[i] = mas[j][k];
                    i++;
                }
            }
        }
        return massiv;
    }
}

