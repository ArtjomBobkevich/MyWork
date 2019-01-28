package com.company;

import java.util.Scanner;

public class HW2vTwo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = sc1.nextInt();
        Recur2(value);

    }

    public static void Recur2(int a) {
        int fib = 0;
        int fib2 = 1;
        for (int i = Recur(a+2); i >= 0; i--) {
            int sum = fib + fib2;
            fib2 = fib;
            fib = sum;
            System.out.print(" " + fib2);
        }
    }


    public static int Recur (int a){
        if (a==1){
            return 1;
        }
        a-=Recur(a-1);
        return a;
    }
}





    //    public static int Recur (int a){
//        int b;
//        int fib1=0;
//        int fib2=1;
//        int sum=fib1+fib2;
//        fib2=fib1;
//        fib1=sum;
//        if(a==1){
//            System.out.println(1);
//        }
//        else if(a==0){
//            System.out.println(0);
//        }else
//            System.out.println(fib2);
//        return b;
//        }

