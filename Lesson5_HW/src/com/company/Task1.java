package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        System.out.println("Это полиндром? " + comparison(str));
    }

    public static boolean comparison(String str) {
        int coincidence = 0;
        char firstChar;
        char lastChar;
        for (int i = 0; i < str.length(); i++) {
            firstChar = str.charAt(i);
            lastChar = str.charAt((str.length() - 1) - i);
            if (firstChar == lastChar) {
                coincidence++;
            } else {
                return false;
            }
        }
        if (coincidence == str.length()) {
            return true;
        }
        return false;
    }
}
