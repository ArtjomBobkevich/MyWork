package com.company;

import java.util.Scanner;

public class Lesson2_HM3 {
    public static void main(String[] args) {
        Scanner scJ = new Scanner(System.in);
        Scanner scM = new Scanner(System.in);
        Scanner scD = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scJ.nextInt();
        System.out.println("Введите число b: ");
        int b = scM.nextInt();
        System.out.println("Введите число c: ");
        int c = scD.nextInt();
        if (discriminant(a, b, c) > 0) {
            moreZero(a, b, c);
        } else if (discriminant(a, b, c) == 0) {
            System.out.println("Корень от нуля: " + zero(a, b, c));
        } else
            System.out.println("Дискриминант меньше нуля");
        System.out.println("Дискриминант: " + discriminant(a, b, c));
    }


    public static void moreZero(int a, int b, int c) {

        double negative = (((-b) - (Math.sqrt(discriminant(a, b, c)))) / (2 * a));
        System.out.println(negative);
        double pozitive = (((-b) + (Math.sqrt(discriminant(a, b, c)))) / (2 * a));
        System.out.println(pozitive);
    }


    public static int zero(int a, int b, int c) {
        int zero = (-b) / (2 * a);
        return zero;
    }


    public static int discriminant(int a, int b, int c) {
        int div = (b * b) - (4 * (a * c));
        return div;
    }
}