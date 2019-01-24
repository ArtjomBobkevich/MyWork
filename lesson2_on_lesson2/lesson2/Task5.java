package lesson2;

public class Task5 {

    public static void main(String[] args) {
        int result = findMaxValue2(int firstValue, int secondValue);
        System.out.println(result);
    }

    public static int findMaxValue(int firstValue, int secondValue) {
        int result = firstValue;
        if (firstValue < secondValue) {
            result = secondValue;
        }

        return result;
    }

    public static int findMaxValue2(int firstValue, int secondValue) {
        return firstValue > secondValue
                ? firstValue
                : secondValue;
    }
}
