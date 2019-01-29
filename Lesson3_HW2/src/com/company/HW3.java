package com.company;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите кол-во дней: ");
        int day = sc1.nextInt();

        Function(day);
    }

    public static void Function(int a) {
        Scanner sc2 = new Scanner(System.in);
        int i = 0;
        double d = 0;
        int g = 0;
        for (i = 1; i <= a; ++i) {
            System.out.println("Введите осадки для дня № " + i + " :");
            int precip = sc2.nextInt();
            int c = precip;
            d = d + c;
            if (g < c) {
                g = c;
            }
        }
        System.out.println("Количество дней: " + (i - 1));
        System.out.println("Сумма осадков: " + d);
        System.out.println("Среднее кол-во осадков в день: " + (d / (i - 1)));
        System.out.println("Максимальное кол-во осадков в день:" + g);
    }

}
