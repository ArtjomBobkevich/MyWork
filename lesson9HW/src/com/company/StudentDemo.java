package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {

        Student student = new Student("Masha", "Ivanova", 23, 7);
        Student student1 = new Student("Masha", "Kruz", 27, 6);
        Student student2 = new Student("Pedja", "Montenegro", 25, 8);
        Student student3 = new Student("Galja", "Awdeeva", 34, 5);
        Student student4 = new Student("Dima", "Brigadir", 35, 9);
        Student student5 = new Student("Sasha", "White", 45, 10);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Список студентов:");
        System.out.println(students);
        foundMaxAvaragePoint(students);

        students.sort(new StudentFirstNameComporator()
                .thenComparing(new StudentLastNameComporator())
                .thenComparing(new StudentPointComparator())
                .thenComparing(new StudentAgeComporator()));

        students.sort(Comparator.comparing(Student::getFirstName)
                .thenComparing(Student::getLastName)
                .thenComparing(Student::getAvaragePoint)
                .thenComparing(Student::getAge));

        System.out.println();
        System.out.println("Отсортировано: ");
        System.out.println(students);
    }

    public static void foundMaxAvaragePoint(List<Student> students) {
        if (!students.isEmpty()) {
            Student result = students.get(0);
            for (Student currentActor : students) {
                if (currentActor.getAvaragePoint() > result.getAvaragePoint()) {
                    result = currentActor;
                }
            }
            System.out.println();
            System.out.println("Максимальный средний балл у студента:");
            System.out.println(result);
        }
    }
}
