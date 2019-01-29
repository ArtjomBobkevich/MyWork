package com.company;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] twoMas = {{1, 2, 3},
                {4, 5, 6}};


    }

    public static void linearize(int[][] mas) {
        int massiv ;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                massiv = mas[i][j];
                int []mass={massiv,};
                System.out.println(mass);
            }
        }
    }
}