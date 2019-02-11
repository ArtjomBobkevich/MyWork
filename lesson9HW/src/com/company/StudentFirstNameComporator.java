package com.company;

import java.util.Comparator;

public class StudentFirstNameComporator implements Comparator<Student> {

    @Override
    public int compare (Student x1,Student x2){
        return x1.getFirstName().compareTo(x2.getFirstName());
    }
}
