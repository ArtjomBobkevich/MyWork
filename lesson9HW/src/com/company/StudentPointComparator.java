package com.company;

import java.util.Comparator;

public class StudentPointComparator implements Comparator<Student> {

    @Override
    public int compare(Student x1, Student x2) {
        return Integer.compare(x1.getAvaragePoint(), x2.getAvaragePoint());
    }
}
