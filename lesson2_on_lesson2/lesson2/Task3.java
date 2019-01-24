package lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        if (isLeapYear(value)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
