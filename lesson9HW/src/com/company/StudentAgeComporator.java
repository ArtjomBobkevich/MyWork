package com.company;

import java.util.Comparator;

public class StudentAgeComporator implements Comparator<Student>{

    @Override
    public int compare(Student x1, Student x2) {
        return Integer.compare(x1.getAge(), x2.getAge());
    }
}
