package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Введите число: ");
        int ch=sc1.nextInt();
        System.out.println(isRecur(ch));
        System.out.println(isCycle(ch));
    }


    public static int isRecur(int a){
        if (a==1){
            return 1;
        }
        a=a*isRecur(a-1);
        return a;
    }


    public static int isCycle(int a){
        int result=a;
        for(int i=1;i<a;i++){
            result*=i;
        }
        return result;
    }
}
