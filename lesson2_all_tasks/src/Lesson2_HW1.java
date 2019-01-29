
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
        month(day, month, year);
    }


    public static void month(int day, int month, int year) {

        if (month <= 12) {
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10))) {
                if (day < 31) {
                    System.out.println("Следующий день: " + (day + 1) + "." + month + "." + year);
                } else if (day == 31) {
                    day = 1;
                    System.out.println("Следующий день: " + day + "." + (month + 1) + "." + year);
                } else
                    System.out.println("Некорректно введён день!");
            } else if (((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
                if (day < 30) {
                    System.out.println("Следующий день: " + (day + 1) + "." + month + "." + year);
                } else if (day == 30) {
                    day = 1;
                    System.out.println("Следующий день: " + day + "." + (month + 1) + "." + year);
                } else
                    System.out.println("Некорректно введён день!");
            } else if (month == 2) {
                if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)) {
                    if (day < 29) {
                        System.out.println("Следующий день: " + (day + 1) + "." + month + "." + year);
                    } else if (day == 29) {
                        day = 1;
                        System.out.println("Следующий день: " + day + "." + (month + 1) + "." + year);
                    } else
                        System.out.println("Некорректно введён день!");
                } else if (day < 28) {
                    System.out.println("Следующий день: " + (day + 1) + "." + month + "." + year);
                } else if (day == 28) {
                    day = 1;
                    System.out.println("Следующий день: " + day + "." + (month + 1) + "." + year);
                } else
                    System.out.println("Некорректно введён день!");
            } else if (month == 12) {
                if (day < 31) {
                    System.out.println("Следующий день: " + (day + 1) + "." + month + "." + year);
                } else if (day == 31) {
                    day = 1;
                    month = 1;
                    System.out.println("Следующий день: " + day + "." + month + "." + (year + 1));
                } else
                    System.out.println("Некорректно введён день!");
            }
        } else
            System.out.println("Некорректно введён месяц");
    }
}
