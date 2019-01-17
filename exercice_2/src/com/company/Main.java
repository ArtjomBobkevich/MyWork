package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        if ((j%4)==0){
            if((j%100)!=0){
                System.out.println("Високосный");
            }
            else if ((j%100)==0 & (j%400)==0){
                System.out.println("Високосный");
            }
            else {
                System.out.println("Не високосный");
            }
        }
        else {
            System.out.println("Не високосный");
        }
    }
}
