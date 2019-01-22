package com.company;

import java.util.Scanner;

class practik_1 {
    public static void main (String args[]){
//        float x =10.0F;
//        final int y=5;
//        double w=y*x;
//        System.out.println(w);
//        x=7;
//        System.out.println(x+"  "+y);
//        char ch=102;
//        System.out.println(ch);
//        ch='f';
//        System.out.println(ch);
//        String as = "Hello World";
//        System.out.println(as);
//        int a=4,b=5;
//        System.out.printf("a=%d; b=%d \n",a,b);
//        System.out.printf("a=%d; b=%d \n",a,b);
        Scanner too=new Scanner(System.in);
//        int num=too.nextInt();
//       System.out.println("press:" +num);
        System.out.println("Press enter your name: ");
        String name= too.nextLine();
        System.out.println("Press enter How old are you: ");
        int years=too.nextInt();
        System.out.println("Press enter How money do you want: ");
        double money=too.nextDouble();
        System.out.println("your name: "+name);
        System.out.println("You are old " +years);
        System.out.println("Do you want "+ money);
    }
}
