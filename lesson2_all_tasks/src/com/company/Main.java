package com.company;

import java.util.Scanner;

class Lesson2_HW1 {

    public static void main(String[] args) {
        Scanner scJ = new Scanner(System.in);
        Scanner scM = new Scanner(System.in);
        Scanner scD = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scJ.nextInt();
        System.out.println("Введите месяц: ");
        int month = scM.nextInt();
        System.out.println("Введите день: ");
        int day = scD.nextInt();
        if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)) {
            if (month < 12) {
                if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day < 31)) {
                    System.out.println((day + 1) + "." + month + "." + year);
                } else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day == 31)) {
                    day = 1;
                    System.out.println(day + "." + (month + 1) + "." + year);
                } else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day > 31)) {
                    System.out.println("Некорректно введён день!");
                } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day < 30)) {
                    System.out.println((day + 1) + "." + month + "." + year);
                } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 30)) {
                    day = 1;
                    System.out.println(day + "." + (month + 1) + "." + year);
                } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 30)) {
                    System.out.println("Некорректно введён день!");
                } else if ((month == 2) && (day < 29)) {
                    System.out.println((day + 1) + "." + month + "." + year);
                } else if ((month == 2) && (day == 29)) {
                    day = 1;
                    System.out.println(day + "." + (month + 1) + "." + year);
                } else if ((month == 2) && (day > 29)) {
                    System.out.println("Некорректно введён день!");
                }
            } else if ((month == 12) && (day <= 31)) {
                System.out.println(day + "." + month + "." + year);
            } else if ((month == 12) && (day > 31)) {
                month = 1;
                day = 1;
                System.out.println(day + "." + month + "." + (year + 1));
            } else if (month > 12) {
                System.out.println("Не корректен месяц");
            }
        } else if (month < 12) {
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day < 31)) {
                System.out.println((day + 1) + "." + month + "." + year);
            } else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day == 31)) {
                day = 1;
                System.out.println(day + "." + (month + 1) + "." + year);
            } else if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) && (day > 31)) {
                System.out.println("Некорректно введён день!");
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day < 30)) {
                System.out.println((day + 1) + "." + month + "." + year);
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 30)) {
                day = 1;
                System.out.println(day + "." + (month + 1) + "." + year);
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11) && (day == 30)) {
                System.out.println("Некорректно введён день!");
            } else if ((month == 2) && (day < 28)) {
                System.out.println((day + 1) + "." + month + "." + year);
            } else if ((month == 2) && (day == 28)) {
                day = 1;
                System.out.println(day + "." + (month + 1) + "." + year);
            } else if ((month == 2) && (day > 28)) {
                System.out.println("Некорректно введён день!");
            }
        } else if ((month == 12) && (day <= 31)) {
            System.out.println(day + "." + month + "." + year);
        } else if ((month == 12) && (day > 31)) {
            month = 1;
            day = 1;
            System.out.println(day + "." + month + "." + (year + 1));
        } else if (month > 12) {
            System.out.println("Не корректен месяц");
        }
    }
}

  //  if ((yearLeap%400)==0||((yearLeap%4==0)&&(yearLeap%100)!=0)) {

