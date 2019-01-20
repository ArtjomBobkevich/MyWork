package com.company;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

class OverLoad {
    void ovlDemo(int c) {
        System.out.println("Без параметров"+c);
    }
  //  void ovlDemo(int a) {
   //     System.out.println("Один параметр: "+a);
 //   }
    int ovlDemo(int a, int b) {
        System.out.println("Два параметра: "+a+" "+b);
        return a+b;
    }
    double ovlDemo(double a, double b) {
        System.out.println("Два параметра типа double: "+a+" "+b);
    return a+b;
    }
}


class OverLoadDemo {
    public static void main (String args[]){
        OverLoad ob = new OverLoad();
        int resI;
        double resD;
        ob.ovlDemo(2);
        System.out.println();
       // ob.ovlDemo(2);
      //  System.out.println();
        resI=ob.ovlDemo(4,6);
        System.out.println("Результат вызова ob.ovlDemo(4,6): "+ resI);
        System.out.println();
        resD=ob.ovlDemo(1.1,2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1,2.32): "+resD);
    }
}