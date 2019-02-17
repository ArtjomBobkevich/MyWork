package com.company;

public class Person {

    private String firstName;
    private String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return String.join(" ", firstName,lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
