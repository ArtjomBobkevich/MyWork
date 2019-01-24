package lesson2;

public class Task7 {

    public static void main(String[] args) {
//        System.out.println(isLastDigitThree(134333));
        String result = isEven(0) ? "Четное" : "Нечетное";
        System.out.println(result);
    }

    public static boolean isLastDigitThree(int value) {
        int lastDigit = value % 10;
        return lastDigit == 3;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
