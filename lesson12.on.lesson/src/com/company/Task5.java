package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Person >list=Arrays.asList(new Person("sdfsdf","sdfsdf",90),
                new Person("sdf","sdfs",80),
                new Person("sdfsdfsdf","sdfsdfdddq",70),
                new Person("sdfsdfweqdqcqwfd","sdfsdfwefvsd",60));

       Object a= list.stream()
               .filter(person -> person.getFirstName().length()<10)
               .max(Comparator.comparing(Person::getAge))
                .map(Person::getFirstName);
        System.out.println(a);
    }
}
