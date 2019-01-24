
import java.util.Scanner;

class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.next();

        compareWords(firstWord, secondWord);
    }

    public static void compareWords(String first, String second) {
        if (first.equals(second)) {
            System.out.println("Отлично! Слова одинаковые!");
        } else if (first.equalsIgnoreCase(second)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (first.length() == second.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        } else {
            System.out.println("Мимо!");
        }
    }
}