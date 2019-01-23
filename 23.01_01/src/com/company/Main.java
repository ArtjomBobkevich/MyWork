package com.company;

import java.util.Scanner;

class Zan9tie_1_2 {
    public static void main(String[] args) {
        int a = 72;
        short b=(short)a;
        System.out.println(b);
        char ch=(char)a;
        System.out.print(ch+"\n");
        String c= "abc-it`s food";
        System.out.println(c);
        char ch1='c';
        int g=(int) ch1;
        System.out.println(g);
        double do1=5.5999;
        int do2=(int)do1;
        System.out.println(do2);
        do2=(int)Math.round(do1);
        System.out.println(do2);
        String answer = a>do1?"Верно":"Не верно";
        System.out.println(answer);
        answer = a<do1?"Верно":"Не верно";
        System.out.println(answer);
        if (a>do2 && a>7){
            System.out.println("more");
        }
        if (a>do2 || a<7){
            System.out.println("more");
        }
//        Scanner sc=new Scanner(System.in);
//        int w=sc.nextInt();
        //for(;;) {
 //           switch (w) {
 //               case 1:
 //                   System.out.println("bye");
 //                   break;
 //               default:
 //                   System.out.print("Try again\n");
  //                  break;
 //           }
   //     }
  //     for(;;){
  //         System.out.println(a);
  //         a++;
  //         if(a==55000){
  //             break;
  //         }
 //      }
 //       int mass[];
  //      mass=new int[5];
 //       mass[0]=1;
 //       mass[1]=2;
 //       mass[2]=3;
 //       mass[3]=4;
 //       mass[4]=5;
 //       int dl=mass.length;
 //       System.out.println(dl);
 //       int sum=mass[1]+mass[4];
 //       System.out.println(sum);
 //       int mass[]={1,2,3,4,5};
 //       int mass2[]={2,3,4,5};
 //       int mnoz=mass[1]*mass2[3];
 //       System.out.println(mnoz);
 //       int massv2[][]={{1,2,3},{4,5,6}};
 //       int dl=massv2[0].length;
 //       System.out.println(dl);
 //       int mass3[]={1,2,3,4,5};
 //       for(int i:mass3){
 //           System.out.println(i);
 //       }
        int array[]={1,2,3,4,5};
        for(int ddd=0; ddd<array.length;ddd++){
            array[ddd]=array[ddd]*2;
            System.out.println(array[ddd]);
        }
    }
}