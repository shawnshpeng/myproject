package com.shawn.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2019, 12, 25, 8, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2019, 12, 25, 10, 8, 0);
        // Car car = new Car("AA-0001", enter.atZone(ZoneId.systemDefault()).toEpochSecond());
        Car car = new Car("AA-0001", enter);
        // car.setLeave(System.currentTimeMillis() + 1000 * 60 * 60 * 2);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long) Math.ceil(car.getDuration() / 60f);
        System.out.println(hours);
        System.out.println(30 * hours);

        // java8
        // java8();

        // javaDate();
    }

    private static void java8() {
        // Instant - T：時間 Z：時區 UTC/GMT 時間 適用國際化
        Instant instant = Instant.now();
        System.out.println(instant);
        // LocalDateTime, LocalDate, LocalTime - 本地化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // DateTimeFormatter 格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        // Instant, LocalDateTime, LocalDate, LocalTime 為 Immutable 物件
        System.out.println(now.plus(Duration.ofHours(3)));

        LocalDateTime other = LocalDateTime.of(2019, 7, 10, 8, 0, 0);
        System.out.println(other);
    }

    private static void javaDate() {
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
        // calendar 為 Mutable 物件
        calendar.set(Calendar.MONTH, 8); // 注意：月份從 0 開始。故這是 10
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }
}
