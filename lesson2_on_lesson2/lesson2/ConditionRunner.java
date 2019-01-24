package lesson2;

public class ConditionRunner {

    public static void main(String[] args) {
        int value = -101;
        if (value > 100) {
            System.out.println("Больше!");
        } else if (value > 0) {
            System.out.println("Хотя бы положительное");
        }
    }
}
