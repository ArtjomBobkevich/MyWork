package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        System.out.println(romToArab(str));
    }


    public static int romToArab(String str) {
        String trueStr = str.toUpperCase();
        int value = 0;
        int valuePast = 0;
        for (int i = trueStr.length() - 1; i >= 0; i--) {
            char simbol = trueStr.charAt(i);
            if (simbol == 'M') {
                value = function(1000, valuePast, value);
                valuePast = 1000;
            }
            if (simbol == 'D') {
                value = function(500, valuePast, value);
                valuePast = 500;
            }
            if (simbol == 'C') {
                value = function(100, valuePast, value);
                valuePast = 100;
            }
            if (simbol == 'L') {
                value = function(50, valuePast, value);
                valuePast = 50;
            }
            if (simbol == 'X') {
                value = function(10, valuePast, value);
                valuePast = 10;
            }
            if (simbol == 'V') {
                value = function(5, valuePast, value);
                valuePast = 5;
            }
            if (simbol == 'I') {
                value = function(1, valuePast, value);
                valuePast = 1;
            }
        }
        return value;
    }

    public static int function(int value, int valuePast, int lastValue) {
        if (value < valuePast) {
            return lastValue - value;
        } else
            return lastValue + value;
    }

}