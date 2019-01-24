package com.company;

import java.util.Scanner;

public class Lesson2_HM2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);
        Scanner sc4=new Scanner(System.in);
        System.out.println("Введите длину здания №1: ");
        int LH1=sc1.nextInt();
        System.out.println("Введите ширину здания №1: ");
        int WH1=sc2.nextInt();
        System.out.println("Введите длину здания №2: ");
        int LH2=sc1.nextInt();
        System.out.println("Введите ширину здания №2: ");
        int WH2=sc2.nextInt();
        System.out.println("Введите длину участка: ");
        int LA= sc3.nextInt();
        System.out.println("Введите ширину участка: ");
        int WA=sc4.nextInt();
        if(((LH1*WH1)+(LH2*WH2))<(LA*WA)){
            if(((WH1&WH2)<WA)&&((LH1+LH2)<LA)){
                System.out.println("Поместится");
            }else if(((LH1&LH2)<LA)&&((WH1+WH2)<WA)){
                System.out.println("123");
            }
            else
                System.out.println("Нет");
        }else
            System.out.println("здание не поместится");
    }
}


