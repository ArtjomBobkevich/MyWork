package com.company;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = { 9, 7, 2, 3, 1, 4, 2, 1, 6, 7, 1, 8, 9};
        System.out.println(Arrays.toString(changeSimilarValue(array)));
    }

    public static int [] changeSimilarValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i]=0;
                }
            }
        }
        return array;
    }
}



