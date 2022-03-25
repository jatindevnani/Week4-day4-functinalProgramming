package com.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Jatin", 99));
        students.add(new Student(14, "Palak", 83));
        students.add(new Student(7, "Salman", 75));
        students.add(new Student(21, "Chirag", 62));
        students.add(new Student(19, "Ayushi", 95));

        //Filtering students with marks less than 80
        List<Student> marksBelow80Students = students.stream().filter(elem -> elem.getMarks() < 80).collect(Collectors.toList());
        System.out.println("\nStudent with marks less than 80 are: \n");
        for(Student student: marksBelow80Students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll: " + student.getRoll());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("______________________________________");
        }
    }
}
