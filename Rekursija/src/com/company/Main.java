package com.company;

class Factorial {
    int factR(int n) {
        int result;
        if(n==1)
            return 1;
        result=factR(n-1)*n;
        return result;
    }
    int factI(int n){
        int t, result;
        result=1;
        for(t=1; t<=n;t++)
            result *=t;
        return result;
    }
}
class Recursion {
    public static void main (String args[]) {
        Factorial f=new Factorial();
        System.out.println("Вычисление рекурсивным методом");
        System.out.println("Факториал 6 равен "+ f.factR(6));
        System.out.println("Факториал 4 равен "+ f.factR(4));
        System.out.println("Факториал 5 равен "+ f.factR(5));
        System.out.println();

        System.out.println("Вычисление итеративным методом");
        System.out.println("Факториал 3 равен "+ f.factI(3));
        System.out.println("Факториал 4 равен "+ f.factI(4));
        System.out.println("Факториал 5 равен "+ f.factI(5));
        System.out.println();
    }
}