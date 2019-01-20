import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
                if (a == 1) {
                    System.out.println(a + "\tрубль");
                }
                else if (a == 2 | a == 3 | a == 4) {
                    System.out.println(a + "\tрубля");
                }
                else {
                    System.out.println(a + "\t рублей");
                }
            }
}
