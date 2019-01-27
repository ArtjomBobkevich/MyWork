package lesson3;

public class WhileExample {

    public static void main(String[] args) {
        int value = 1;
        while (true) {
            System.out.println("бесконечность");
            if (value++ == 66) {
                break;
            }
        }
    }

    private static void test2() {
        int value = 1;
        do {
            value = value++ + 2;
            System.out.println(value);
        } while (value < 10);
    }

    private static void test() {
        int value = 10;
        while (value > 0) {
            System.out.println(value--);
        }
    }
}
