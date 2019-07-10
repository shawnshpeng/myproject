package com.shawn.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        // Generics 泛型
        // < > diamond symbol，只能放類別
        // List 的特性：順序、索引值、可重覆
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68, 88, 77, 99, 50);
        for (Integer score : scores) {
            System.out.println(score);
        }
        // arrayTest();
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
        // numbers[5] = 7;
        int[] scores = {68, 88, 77, 99, 50};
        System.out.println(scores);
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
