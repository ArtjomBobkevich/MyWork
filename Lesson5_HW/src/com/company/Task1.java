package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        int a=0;
        char c, b;
        for (int i = 0; i < str.length();i++ ) {
            c = str.charAt(i);
            b = str.charAt((str.length() - 1) - i);
            if (c == b) {
                a++;
            }
            if (c != b) {
                System.out.println("Не полиндром");
                break;
            }
        }
        if (a==str.length()){
            System.out.println("Полиндром");
        }
    }
}
