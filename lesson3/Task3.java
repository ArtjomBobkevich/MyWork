package lesson3;

public class Task3 {

    public static void main(String[] args) {
        int value = 113;
        boolean result = isSimple(value);
        System.out.println(result);
    }

    private static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
