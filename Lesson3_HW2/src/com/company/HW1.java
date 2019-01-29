package com.company;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = sc1.nextInt();
        System.out.println("Сумма равна: " + function(value));
    }

    public static int function(int a) {
        if (a == 1) {
            return 1;
        }
        a += function(a - 1);
        return a;
    }
}
