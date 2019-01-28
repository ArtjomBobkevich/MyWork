package lesson3;

public class Task6 {

    public static void main(String[] args) {
        int value = 1243;

        System.out.println(test1(value));
    }

    private static void test3(int value, int result) {
        for (int current = value; current / 10 != 0 || current % 10 != 0 ; current /= 10) {
            result += current % 10;
        }
        System.out.println(result);
    }

    private static void test(int value, int result) {
        while ((value / 10 != 0) || (value  % 10 != 0)) {
            result += value % 10;
            value /= 10;
        }
        System.out.println(result);
    }

    private static int test1(int value) {
        int result = 0;
        while (value != 0) {
            result += value % 10;
            value /= 10;
        }

        return result;
    }
}
