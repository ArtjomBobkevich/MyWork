package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int[] array1 = {random(), random(), random(), random(), random(), random(), random(), random()};
        int[] array2 = {random(), random(), random(), random(), random(), random()};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(mergeArrays(array1,array2)));
    }

    public static int [] mergeArrays(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];
        int indexArray1 = 0;
        int indexArray2 = 0;
        for (int i = 0; i < newArray.length; ) {
            if (indexArray1 < array1.length) {
                newArray[i] = array1[indexArray1];
                indexArray1++;
                i++;
            }
            if (indexArray2 < array2.length) {
                newArray[i] = array2[indexArray2];
                indexArray2++;
                i++;
            }
        }
        return newArray;
    }

    public static int random() {
        return new Random().nextInt(100);
    }
}




