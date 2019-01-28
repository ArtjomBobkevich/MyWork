package com.company;

public class Task1 {
    public static void main(String[] args) {
        int mas[]={1,3,5,7,9,11,13,15};
        for(int i: mas){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i]+" ");
        }
    }
}
