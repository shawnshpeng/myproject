package com.shawn;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        Person person = new Person();
        person.hello();
        person.weight = 66.5f;
        person.height = 1.7f;
        System.out.println(person.bmi());
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
