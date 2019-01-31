package com.company;

public class Task2 {
    public static void main(String[] args) {
        String[] str = {"was", "sos", "xxx"};
        String[] str1 = {"yyy", "was", "sos"};
        function(str, str1);
    }

    public static void function(String[] str, String[] str1) {
        int Index3 = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str1.length; j++) {
                if (str[i].equals(str1[j]) ) {  //
                    Index3++;
                }
            }
        }
        if (Index3 == str.length) {
            System.out.println("Идентичный");
        } else if (Index3 < str.length && Index3 != 0) {
            System.out.println("Почти");

        } else
            System.out.println("Мимо");
    }
}
