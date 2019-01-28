package lesson3;

public class Task4 {

    public static void main(String[] args) {
        char currentChar = 'b';
        int counter = 0;
        while (!isVowel(currentChar) || ++counter != 2) {
            System.out.println(currentChar++);
        }
    }

    private static void test1(char value, int counter) {
        for (char currentChar = value; ; currentChar++) {
            if (isVowel(currentChar) && ++counter == 2) {
                break;
            }
            System.out.println(currentChar);
        }
    }

    public static boolean isVowel(char value) {
        String vowels = "eyuioa";
        return vowels.indexOf(value) != -1;
    }
}
