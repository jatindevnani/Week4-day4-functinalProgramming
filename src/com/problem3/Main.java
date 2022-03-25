package com.problem3;

import com.problem1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new com.problem1.Student(3, "Jatin", 99));
        students.add(new com.problem1.Student(14, "Palak", 83));
        students.add(new com.problem1.Student(7, "Salman", 75));
        students.add(new com.problem1.Student(21, "Chirag", 62));
        students.add(new Student(19, "Ayushi", 95));

        List<Employee> employees = students.stream().map(elem -> new Employee(elem.getRoll(), elem.getName(), elem.getMarks()*1000)).collect(Collectors.toList());

        System.out.println("Employees: \n");
        for(Employee employee: employees) {
            System.out.println("Name: " + employee.getEmpName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("ID: " + employee.getEmpId());
            System.out.println("___________________________________\n");
        }
    }
}
