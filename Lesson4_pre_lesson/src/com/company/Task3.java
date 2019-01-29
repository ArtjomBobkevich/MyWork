package com.company;

public class Task3 {
    public static void main(String[] args) {
        int mas[] = {2, 4, 3, 2, 0, 6, 7, 6, 5, 4, 2, 15, 6, 5, 4};
        maxMinValue(mas);
        AverageSumValue(mas);
    }


    public static void maxMinValue(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] <= min)
                min = a[i];
        }
        System.out.println("Минимальное значение: "+min);
        System.out.println("Максимальное значение:  "+max);
    }


    public static void AverageSumValue(int a[]) {
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > a[indexMax])
                indexMax = i;
            if (a[i] <= a[indexMin])
                indexMin = i;
        }
        System.out.println("Максимальный индекс: "+indexMax);
        System.out.println("Минимальный индекс: "+indexMin);
        for (int i = indexMin; i < indexMax; i++) {
            sum = sum + a[i];
        }
        System.out.print("Сумма значений между индексами: "+sum);
    }
}
