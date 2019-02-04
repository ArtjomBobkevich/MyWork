package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        System.out.println(function(str));

    }


    public static boolean function(String str) {
        int matches = 0;
        char firstChar, lastChar;
        for (int i = 0; i < str.length(); i++) {
            firstChar = str.charAt(i);
            lastChar = str.charAt((str.length() - 1) - i);
            if (firstChar == lastChar) {
                matches++;
            }
            if (firstChar != lastChar) {
                System.out.println("Не полиндром");
                return false;
            }
        }
        if (matches == str.length())
            System.out.println("Полиндром");
        return true;
    }
}
