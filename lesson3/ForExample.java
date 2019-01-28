package lesson3;

public class ForExample {

    public static void main(String[] args) {
        for (int i = 10; i < 20; i = nextValue(i)) {
            System.out.println(i);
        }
    }

    public static int nextValue(int current) {
        return current + 1;
    }
}
