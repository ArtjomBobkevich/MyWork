package com.company;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countQuantityWords(str));
    }

    private static Map<String, Integer> countQuantityWords(String string) {
        Map<String, Integer> map = new HashMap<>();
        String[] subStr;
        String delit = " ";
        subStr = string.split(delit);
        int[] contain = new int[subStr.length];
        for (int j = 0; j < contain.length; j++) {
            contain[j] = 1;
        }
        int value;
        for (int i = 0; i < subStr.length; i++) {
            if (map.containsKey(subStr[i])) {
                value = map.get(subStr[i]);
                map.put(subStr[i], contain[i] + value);
            } else {
                map.put(subStr[i], contain[i]);
            }
        }
        return map;
    }
}