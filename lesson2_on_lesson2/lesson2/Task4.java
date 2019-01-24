package lesson2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.next();

        compareWords(firstWord, secondWord);
    }

    public static void compareWords(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            System.out.println("Отлично! Слова одинаковые!");
        } else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (firstWord.length() == secondWord.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        } else {
            System.out.println("Мимо!");
        }
    }
}
