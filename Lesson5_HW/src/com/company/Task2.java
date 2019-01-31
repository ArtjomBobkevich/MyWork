package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.next();
        function(str);
    }


    public static void function(String str) {
        String a=str.toUpperCase();
        char z='q';
        char n;
        char v='w';
        int g=0;
        int sum=0;
        int indexValue=0;
        int indexValuePast1=0;
        int indexValuePast2=0;
        for (int i =0; i<str.length();i++){
            n=a.charAt(i);
            if (n=='M'){
                g=1000;
                indexValue=6;
            }
            if (n=='D'){
                g=500;
                indexValue=5;
            }
            if (n=='C'){
                g=100;
                indexValue=4;
            }
            if (n=='L'){
                g=50;
                indexValue=3;
            }
            if (n=='X'){
                g=10;
                indexValue=2;
            }
            if (n=='V'){
                g=5;
                indexValue=2;
            }
            if (n=='I'){
                g=1;
                indexValue=1;
            }
            if (i==0){
                sum=g;
                indexValuePast1=indexValue;
            }
            if (i==1) {
                if (indexValuePast1>indexValue){
                    sum+=g;
                    indexValuePast2=indexValuePast1;
                    indexValuePast1=indexValue;
                }if (indexValuePast1<indexValue){
                    sum=g-sum;
                    indexValuePast2=indexValuePast1;
                    indexValuePast1=indexValue;
                }
            }
            if (i>=2) {

            }

        }
        System.out.println(sum);
        System.out.println(z);
        System.out.println(v);
    }
}

// int indexM = a.indexOf('M');
//        int indexD = a.indexOf('D');
//        int indexC = a.indexOf('C');
//        int indexL = a.indexOf('L');
//        int indexX = a.indexOf('X');
//        int indexV = a.indexOf('V');
//        int indexI = a.indexOf('I');
//        int m=0,d=0,c=0,l=0,x=0,v=0,i=0;
//        int valueM=1000,valueD=500,valueC=100,valueL=50,valueX=10,valueV=5,valueI=1;
//        if (indexM>indexD){
//            m=valueM+valueD;
//        }
//        if (indexM<indexD){
//            m=valueM=valueD;
//        }
//        if (indexD>indexC){
//            d=valueD+valueC;
//        }
//        if (indexD<indexC){
//            d=valueD-valueC;
//        }
//        if (indexC>indexL){
//            c=valueC+valueL;
//        }
//        if (indexC<indexL){
//            c=valueC-valueL;
//        }
//        if ()


