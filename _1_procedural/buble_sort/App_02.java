package _1_procedural.buble_sort;

import java.util.Arrays;

public class App_02 {

    //element ascent with condition
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 3, 4, 5, 600, 700, 8, 9};

        System.out.print(Arrays.toString(arr) + " -> ");

        for (int k = 0; k < arr.length - 1; k++) {

            if (arr[k] > arr[k + 1]) {

                App_01.swap(arr, k, k + 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

