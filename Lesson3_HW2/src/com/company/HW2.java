package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = sc1.nextInt();
        fibonachi(value);
        System.out.println();
        int recur2Result = recur(value);
        int recur1result = recur2(value);
        System.out.println("Числа Фибоначи через рекурсию: ");
        for (int i = (value - 1); i >= 0; i--) {
            int sum = recur2Result - recur1result;
            recur2Result = recur1result;
            recur1result = sum;
            if (recur2Result <= value) {
                System.out.print(" " + recur2Result);
            }
        }
    }


    public static void fibonachi(int a) {
        int fib = 0;
        int fib2 = 1;
        System.out.println("Числа Фибоначи через цикл:");
        for (int i = 1; i <= a; i++) {
            int sum = fib + fib2;
            fib2 = fib;
            fib = sum;
            System.out.print("" + fib2 + " ");
            i = sum;
        }
    }

    public static int fibonachiByRecur(int a) {
        int valueFib;
        if (a == 1) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else
            valueFib = fibonachiByRecur(a - 1) + fibonachiByRecur(a - 2);
        return valueFib;
    }


    public static int recur(int a) {
        int valueFib1 = fibonachiByRecur(a);
        return valueFib1;
    }


    public static int recur2(int a) {
        int valueFib2 = fibonachiByRecur(a - 1);
        return valueFib2;
    }

}


//if (i>2){
//                i=i+(i-1);
//            }
//            else i++;