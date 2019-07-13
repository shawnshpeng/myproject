package com.shawn.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        // 適用亞洲語系
        bufferedReader();
        // fileReader();

        // 適用西方語系
        // inputStream();
    }

    private static void bufferedReader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            // 讀一行
            String line = br.readLine();
            // 沒有資料再 readLine() 會得到 null
            while (line != null) {
                System.out.println(line);
                // 讀下一行
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        try {
            FileReader fr = new FileReader("data.txt");
            // 讀一個 char
            int n = fr.read();
            // 沒有資料再 read() 會得到 -1
            while (n != -1) {
                System.out.print((char) n);
                // 讀下一個 char
                n = fr.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        // InputStream 最上層類別
        try {
            FileInputStream is = new FileInputStream(file);
            // 讀一個 Byte
            int n = is.read();
            // 沒有資料再 read() 會得到 -1
            while (n != -1) {
                System.out.print((char) n);
                // 讀下一個 Byte
                n = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            // 開發時，印出錯誤的追蹤狀態，進行除錯，最後要註解或刪除
            e.printStackTrace();
            // 開發最後階段，印出錯誤訊息
            System.out.println("message");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File open success");
    }
}
