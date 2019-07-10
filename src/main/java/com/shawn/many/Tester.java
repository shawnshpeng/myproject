package com.shawn.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        // Map 的特性：鍵值對 Map<Key, Value>，Key 是唯一值、無順序
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        // 重覆的 Key，會覆蓋 Value
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
        // set();
        // list();
        // arrayTest();
    }

    private static void set() {
        // Set 的特性：不重覆
        // HashSet：無順序
        // TreeSet：順序
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        // 沒順序 => 無索引
        // 只能全部拜訪 iterable
        for (Integer n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
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
