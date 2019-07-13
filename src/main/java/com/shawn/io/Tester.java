package com.shawn.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        // InputStream 最上層類別

        try { // 觀察監控
            InputStream is = new FileInputStream(file);
        } catch (FileNotFoundException e) { // 錯誤處理
            // 開發時，印出錯誤的追蹤狀態，進行除錯，最後要註解或刪除
            e.printStackTrace();
            // 開發最後階段，印出錯誤訊息
            System.out.println("message");
        }
        System.out.println("File open success");
    }
}
