package com.shawn.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        // Date
        Date date = new Date();
        System.out.println(date);
        // 使用 long 儲存從 1970/01/01 00:00:00 至今的毫秒數
        System.out.println(date.getTime());

        // SimpleDateFormat 日期時間格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        // SimpleDateFormat String 轉 Date
        String s = "2019/07/10 08:00:00";
        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Calendar
        Calendar calendar = Calendar.getInstance();
        // Calendar 物件存有時區資訊，用於全球化
        System.out.println(calendar);
        System.out.println(calendar.getTime());

        // Calendar 日期時間運算
        calendar.set(Calendar.MONTH, 8); // 注意：月份從 0 開始。故這是 10
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }
}
