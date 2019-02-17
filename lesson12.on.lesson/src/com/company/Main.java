package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer>list =Arrays.asList(1,3,5,7,9,11,15);
        double result = list.stream()
                .filter(integer -> integer%2==1)
                .filter(it -> it%5==0)               /*одинаковые строки */
                .mapToInt(Integer::intValue)   /*integer to int*/
                .average().getAsDouble();

        System.out.println(result);
    }
}
