package com.shawn.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        // userInput();
        Student student = new Student("Shawn", 77, 99);
        student.print();
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
