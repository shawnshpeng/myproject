package com.shawn.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        // userInput();
        Student.pass = 50;
        Student student = new Student("Shawn", 97, 10);
        Student student2 = new Student("Eric", 60, 40);
        Student student3 = new Student("Jane", 30, 55);
        GraduateStudent graduateStudent = new GraduateStudent("Jack", 55, 65, 60);
        graduateStudent.print();
        student.print();
        student2.print();
        student3.print();
        System.out.println("High score: " + student.highest());
    }

    private static void userInput() {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
        System.out.println("High score: " + student.highest());
    }
}
