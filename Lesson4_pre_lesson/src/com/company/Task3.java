package com.company;

public class Task3 {
    public static void main(String[] args) {
        int mas[]={2,4,3,2,0,6,7,6,5,4,2,15,6,5,4};
        MaxMinValue(mas);
        AverageSumValue(mas);
        }


        public static void MaxMinValue (int []a){
            int max = a[0];
            int min= a[0];
            for (int i=0;i<=a.length-1;i++) {
                if (a[i] > max)
                    max = a[i];
                if (a[i] <= min)
                    min = a[i];
            }
            System.out.println(min);
            System.out.println(max);
        }


        public static void AverageSumValue (int a[]){
            int max = a[0];
            int min=a[0];
            int sum=0;
            for (int i=0;i<=a.length-1;i++) {
                if (a[i] > max)
                    max = i;
                if (a[i] <= min)
                    min = i;
            }
            System.out.println(max);
            System.out.println(min);
            for (int i=min;i<max;i++){
                sum=sum+a[i];
            }
            System.out.print(sum);
        }
    }
