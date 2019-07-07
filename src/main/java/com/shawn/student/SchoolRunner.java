package com.shawn.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.print("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();
        Student student = new Student(name, english, math);
        student.print();
    }
}
