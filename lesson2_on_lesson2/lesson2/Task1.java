package lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        test2();
    }

    private static void test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неправильно введен месяц!");
                break;
        }
    }

    private static void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else if (month == 12 || month >= 1 && month <= 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Неправильно введен месяц!");
        }
    }
}
