package com.company;

import java.util.Scanner;


//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int m = sc.nextInt();
//        if(m==1){
//            System.out.println(m+" рубль");
 //       }
//        else if (m>1 && m<=4){
//            System.out.println(m+" рубля");
//        }
//        else
//            System.out.println(m+" рублей");
//    }
//}


//public class Main {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        switch (m) {
//            case 1:
 //               System.out.println(m + " рубль");
//                break;
//            case 2:
//                System.out.println(m + " рубля");
 //               break;
//            case 3:
 //               System.out.println(m + " рубля");
//                break;
//            case 4:
//                System.out.println(m + " рубля");
//                break;
 //           default:
//                System.out.println(m + " рублей");
//                break;
//        }
//    }
//}

//public class Main {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        if ((m % 4) == 0) {
//           if((m%100)==0){
//               if((m&400)==0){
//                   System.out.println("Високосный");     //не отрабатывает эта строчка
//               }
//               else
//                   System.out.println(" Не Високосный");
//           }
//           else
//               System.out.println("1високосный");
 //       }
//        else
//            System.out.println("1не високосный");
//    }
//}
import java.lang.Object;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String m = sc.nextLine();
//        String k = sc.nextLine();
//        boolean srv;
//       if(srv=m.equals(k)){
//           System.out.println("Отилчно Совпадение");
//       }
//        else if (srv=m.equalsIgnoreCase(k)){
//           System.out.println("Хорошо Почти");
//       }
//        else if(m.length()==k.length()){
//           System.out.println("Ну, хотя бы одной длины");
//       }
//       else
//           System.out.println();
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите год:");
//        int j = sc.nextInt();
//        System.out.println("Введите месяц:");
//        long m = sc.nextLong();
//        System.out.println("Введите день:");
//        int d = sc.nextInt();
//        if((j%4)==0 && (j%100)!=0){                 //високосный
//           if(m==1|m==3|m==5|m==7|m==8|m==10|m==12){
//               if (d<=31){
//                   System.out.println(d+"."+m+"."+j);
//               }
//               else
//                   System.out.println("не корректный день");
//           }
//           else if (m==4|m==6|m==9|m==11){
//               if (d<=30){
//                   System.out.println(d+"."+m+"."+j);
//               }
//               else
//                   System.out.println("не корректный день");
//           }
//           else if(m==2){
//              if (d<=29){
//                   System.out.println(d+"."+m+"."+j);
//               }
//               else
//                   System.out.println("не корректный день");
//           }
//           else if(m>12){
//               System.out.println("Не корректный месяц");
//           }
//           else
//               System.out.println();
//        }
//        else if ((j%4)!=0 | (j%100)==0){            //обычный
//            if(m==1|m==3|m==5|m==7|m==8|m==10|m==12){
//                if (d<=31){
//                    System.out.println(d+"."+m+"."+j);
//                }
//                else
//                    System.out.println("не корректный день");
//            }
//            else if (m==4|m==6|m==9|m==11){
//                if (d<=30){
//                    System.out.println(d+"."+m+"."+j);
//                }
//                else
//                    System.out.println("не корректный день");
//            }
//           else if(m==2){
//                if (d<=29){
//                    System.out.println(d+"."+m+"."+j);
//                }
//                else
//                    System.out.println("не корректный день");
//            }
//            else if(m>12){
//                System.out.println("Не корректный месяц");
//            }
//           else
//                System.out.println();
//        }
//        else
//            System.out.println();
//    }
//}


//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число№1:");
//        int j = sc.nextInt();
//        System.out.println("Введите число№2:");
 //       int w = sc.nextInt();
//        if(j>w){
//            System.out.println(j);
//        }
//        else
//            System.out.println(w);
//    }
//}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int j = sc.nextInt();
        int x = j * j * j;
        System.out.println("Куб введённого числа: "+x);
    }
}