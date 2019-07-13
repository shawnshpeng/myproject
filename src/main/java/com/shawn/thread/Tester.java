package com.shawn.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
        // 建立 Thread 方式 1 - 覆寫 Thread 類別（匿名類別方式）
        // 匿名類別：一個"沒有完整類別名稱"的類別
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread: " + i);
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start(); // 預設不執行，需先覆寫 Tread 類別的 run()

        // 建立 Thread 方式 2 - MyThread
        MyThread myThread = new MyThread();
        myThread.start();

        // 建立 Thread 方式 3 - 實作 Runnable 介面（匿名類別方式）
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable: " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread r = new Thread(runnable);
        r.start();

        // 建立 Thread 方式 4 - Runnable by Lambda
        // Runnable 介面，只需實作一個 run() 方法
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable lambda: " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("main end");
    }
}

// 建立 Thread 方式 2
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}