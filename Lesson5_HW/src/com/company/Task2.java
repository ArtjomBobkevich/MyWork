package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        System.out.println(convertRomanToArabic(str));
    }

    public static int convertRomanToArabic(String str) {
        String trueStr = str.toUpperCase();
        int value = 0;
        int valuePrev = 0;
        for (int i = trueStr.length() - 1; i >= 0; i--) {
            char simbol = trueStr.charAt(i);
            if (simbol == 'M') {
                value = comparison(1000, valuePrev, value);
                valuePrev = 1000;
            }
            if (simbol == 'D') {
                value = comparison(500, valuePrev, value);
                valuePrev = 500;
            }
            if (simbol == 'C') {
                value = comparison(100, valuePrev, value);
                valuePrev = 100;
            }
            if (simbol == 'L') {
                value = comparison(50, valuePrev, value);
                valuePrev = 50;
            }
            if (simbol == 'X') {
                value = comparison(10, valuePrev, value);
                valuePrev = 10;
            }
            if (simbol == 'V') {
                value = comparison(5, valuePrev, value);
                valuePrev = 5;
            }
            if (simbol == 'I') {
                value = comparison(1, valuePrev, value);
                valuePrev = 1;
            }
        }
        return value;
    }

    public static int comparison(int value, int valuePrev, int lastValue) {
        int choice = (value < valuePrev) ? (lastValue - value) : (lastValue + value);
        return choice;

    }
}
