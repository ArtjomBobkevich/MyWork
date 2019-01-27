package com.company;

public class taks1 {
    public static void main(String[] args) {
        double j=24;
        for (int i=1626;i<=2019;i++){
            double x=0.05*j;
            j=x+j;
          //  a+=x;
            System.out.println("В году:"+i+" накапало "+j+"$");
            }
        }
    }
