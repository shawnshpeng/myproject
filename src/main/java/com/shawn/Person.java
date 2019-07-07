package com.shawn;

public class Person {
    String name;
    float weight;
    float height;

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello World");
    }
}
