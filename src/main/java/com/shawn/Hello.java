package com.shawn;

public class Hello {
    public static void main(String[] args) {
        String s = "abcde";
        // s = null;
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(1, 4));
        Person person = new Person("Shawn", 66.5f, 1.7f);
        person.hello();
        person.weight = 66.5f;
        person.height = 1.7f;
        System.out.println(person.bmi());
        int score = 88;
        System.out.println(score < 80 || score > 90);
        // Java 字元可以做數值： '0'=>48, 'A'=>65, 'a'=>97
        char c = 'A';
        System.out.println(c > 'a');
        /*
         * 基本資料型態：byte short char int long float double boolean
         * 參考資料型態：String
         * 包裝類別：Byte Short Character Integer Long Float Double Boolean
         */
        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/
    }
}
