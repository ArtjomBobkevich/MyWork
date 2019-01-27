package lesson3;

public class Task7 {

    public static void main(String[] args) {
        int value = 2000023143;
        String result = "";

        int counter = 0;
        while (value != 0) {
            int ostatok = value % 10;
            value /= 10;
            result = ostatok + result;
            counter++;
            if (counter == 3) {
                result = " " + result;
                counter = 0;
            }
        }

        System.out.println(result);
    }
}
