package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {


        List<String > list= Arrays.asList("sdfsdf","sdas","asdasdasd,");
        long result=list.stream()
                .filter(string->string.length()>3)
                .distinct() /*уникальные значения*/
                .count();
        System.out.println(result);
    }
}
