package lesson2;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(cube2(4));
    }

    public static int cube2(int value) {
        double result = Math.pow(value, 3);
        return (int) result;
    }

    public static int cube(int value) {
        return value * value * value;
    }
}
