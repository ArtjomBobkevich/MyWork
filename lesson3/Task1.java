package lesson3;

public class Task1 {

    public static void main(String[] args) {
        int startYear = 1626;
        int currentYear = 2019;
        double sum = 24; //2.4E1 = 2.4 * 10^1
        double percent = 1.05;

        while (startYear++ < currentYear) {
            sum *= percent;
            System.out.println("Год: " + startYear + ", сумма: " + sum);
        }
    }

    private static double calculatePercents(int startYear, int currentYear, double sum, double percent) {
        double result = sum;
        for (int year = startYear + 1; year <= currentYear; year++) {
            result *= percent;
            System.out.println("Год: " + year + ", сумма: " + result);
        }

        return result;
    }
}
