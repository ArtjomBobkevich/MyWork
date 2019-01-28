package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int value = sc1.nextInt();
        System.out.println("Введите число: ");
        isFibonachi(value);
        System.out.println();
        Recur(value);
    }


    public static void isFibonachi(int a) {
        int fib = 0;
        int fib2 = 1;
        for (int i = 1; i <= a; i++) {
            int sum = fib + fib2;
            fib2 = fib;
            fib = sum;
            System.out.print(" " + fib2);
            i = sum;
        }
    }

    public static int isFibonachiRecur1(int a) {
        int b;
        if (a == 1) {
            return 1;
        } else if (a==0) {
            return 0;
        }else
                b=isFibonachiRecur1(a-1)+isFibonachiRecur1(a-2);
        return b;
    }


    public static void Recur (int a){
        int b=isFibonachiRecur1(a);
        System.out.println(b);
       int c=isFibonachiRecur1(a-1);
        System.out.println(c);
        for (int i=20;i>=0;i--){
            int g=b-c;
            c=g;
            b=c;
            System.out.println(c);
            }

        }
    }




//if (i>2){
//                i=i+(i-1);
//            }
//            else i++;