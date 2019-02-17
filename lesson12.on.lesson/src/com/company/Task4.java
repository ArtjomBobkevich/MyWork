package com.company;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,23);
        String result=list.stream()
                .map(String::valueOf)
                .reduce("",(acc,next)->acc+next); /*схлопывает значения, то есть одно значение прибавляет next*/
        System.out.println(result);
    }
}
