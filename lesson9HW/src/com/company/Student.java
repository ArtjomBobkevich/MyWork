package com.company;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;
    private int avaragePoint;

    public Student (String firstName,String lastName, int age, int avaragePoint){
        this.firstName=firstName;
        this.lastName=lastName;
        this.avaragePoint=avaragePoint;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getAvaragePoint() {
        return avaragePoint;
    }

    @Override
    public String toString() {
        return "Student(" +  lastName +  " " + firstName +  ", возраст " + age +  ", средний балл " + avaragePoint + ')';
    }

    @Override
    public int compareTo(Student x){
        return Integer.compare(avaragePoint,x.avaragePoint);
    }
}
