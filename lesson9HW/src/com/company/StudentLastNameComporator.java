package com.company;

import java.util.Comparator;

public class StudentLastNameComporator implements Comparator<Student> {

    @Override
    public int compare (Student x1,Student x2){
        return x1.getLastName().compareTo(x2.getLastName());
    }
}
