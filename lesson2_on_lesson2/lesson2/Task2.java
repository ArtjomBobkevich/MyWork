package lesson2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int lastSign = value % 10;
        int lastTwoSigns = value % 100;
        if (lastSign == 1 && lastTwoSigns != 11) {
            System.out.println(value + " рубль");
        } else if ((lastSign >= 2 && lastSign <= 4)
                && !(lastTwoSigns >= 12 && lastTwoSigns <= 14)) {
            System.out.println(value + " рубля");
        } else {
            System.out.println(value + " рублей");
        }
    }
}
