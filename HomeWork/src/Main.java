import java.util.Scanner;


class HM_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день:");
        int i = sc.nextInt();
        System.out.println("Введите месяц:");
        int i2 = sc.nextInt();
        System.out.println("Введите год:");
        int i3 = sc.nextInt();
        System.out.println(i + "." + i2 + "." + i3);
        System.out.println("Завтра будет:");
        int n = (i + 1);
        int m=(i2+1);
        if(m<=11) {
            if (n <= 31) {
                System.out.println(n + "." + i2 + "." + i3);
            } else {
                i = 1;
                System.out.println(i + "." + (i2 + 1) + "." + i3);

            }
            }
        else {
            if (n <= 31) {
                System.out.println(n + "." + i2 + "." + i3);
            } else {
                i = 1;
                m=1;
                System.out.println(i + "." + m + "." + (i3+1));

            }
        }

    }
}
