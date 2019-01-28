package com.company;

public class Task2 {
    public static void main(String[] args) {
        int mas[] = new int[100];
        int c=0;
        for (int i = 1; ; i++) {
            if ((i % 13 == 0 || i % 17 == 0)) {
                mas[c] = i;
                System.out.print(mas[c]+" ");
                        if(c>=99){
                            break;
                        }else
                            c++;
                }
            }

        }
    }
// for (int i=0;i<=mas.length;i++){
//            if(i%13==0||i%17==0){
//                mas[i]=i;
//                System.out.println(mas[i]);


//       for(int i:mas){
//                if (i%13==0 || i%17==0){
//                    System.out.print(i);
//                }
//           System.out.print(i);
//            }