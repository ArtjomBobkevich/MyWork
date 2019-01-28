package lesson3;

public class Task2 {

    public static void main(String[] args) {
        int value = 6;
        System.out.println(factorial(value));
        System.out.println(factorial2(value));
        System.out.println(factorialRec(value));
    }

    public static int factorialRec(int value) {
        if (value == 1) {
            return value;
        }

        return value * factorialRec(value - 1);
    }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorial2(int value) {
        int result = 1;
        for (int i = value; i >= 1; i--) {
            result *= i;
        }

        return result;
    }
}
