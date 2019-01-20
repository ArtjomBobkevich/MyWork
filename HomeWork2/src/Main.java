import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Площадь дома №1");
        System.out.println("Длина:");
        int a = sc.nextInt();
        System.out.println("Ширина:");
        int b = sc.nextInt();
        System.out.println("Площадь дома №2");
        System.out.println("Длина:");
        int c = sc.nextInt();
        System.out.println("Ширина:");
        int d = sc.nextInt();
        System.out.println("Площадь участка");
        System.out.println("Длина:");
        int e = sc.nextInt();
        System.out.println("Ширина:");
        int f = sc.nextInt();
        if ((a+c)<=e & b<=f & d<=f) {
            if ((a * b) + (c * d) <= (e * f)) {
                System.out.println("Всё окей!");
            } else {
                System.out.println("Не поместятся");
            }
        }
        else if (a<=e & c<=e & (b+d)<=f) {
            if ((a * b) + (c * d) <= (e * f)) {
                System.out.println("Всё окей!");
            } else {
                System.out.println("Не поместятся");
            }
        }
        else{
            System.out.println("Не поместятся");
        }
    }
}
