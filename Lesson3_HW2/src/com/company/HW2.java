package com.company;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = sc1.nextInt();
        isFibonachi(value);
        System.out.println();
        int Recur2 =Recur(value);
        int Recur1=Recur2(value);
      for (int i=(value-1);i>=0;i--){
          int sum=Recur2-Recur1;
          Recur2=Recur1;
          Recur1=sum;
          if(Recur2<=value){
              System.out.print(Recur2+" ");
          }
      }
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


    public static int Recur (int a){
        int b=isFibonachiRecur1(a);
       return b;
        }


        public static int Recur2 (int a){
            int c=isFibonachiRecur1(a-1);
            return c;
        }

    }




//if (i>2){
//                i=i+(i-1);
//            }
//            else i++;