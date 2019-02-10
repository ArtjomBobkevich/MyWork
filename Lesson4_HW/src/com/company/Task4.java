package com.company;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] doubleArray = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9,10 ,11 ,12},
                {13, 14},
                {15},
                {16,17,18}};
        System.out.println(Arrays.toString(mergeDoubleArray(doubleArray)));
    }

    public static int[] mergeDoubleArray(int[][] doubleArray) {
        int [] newArray=new int[lengthNewArray(doubleArray)];
        for (int i = 0; i < newArray.length; ) {
            for (int j = 0; j < doubleArray.length; j++) {
                for (int k = 0; k < doubleArray[j].length; k++) {
                    newArray[i] = doubleArray[j][k];
                    i++;
                }
            }
        }
        return newArray;
    }

    public static int lengthNewArray (int [][] array){
        int lenghtArrayTemp;
        int lengthArray = 0;
        for (int i = 0; i < array.length; i++) {
            lenghtArrayTemp = array[i].length;
            lengthArray += lenghtArrayTemp;
        }
        return lengthArray;
    }
}

