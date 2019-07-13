package com.shawn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        // 將 exception 往上層拋，main 方法是最上層，所以程式會中斷

        // 建立資料夾
        File jkDir = new File("/Users/shawnpeng/Desktop/jk");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("/Users/shawnpeng/Desktop/jk/output.txt");
        fw.write("abc");
        // 記憶體緩衝區滿的時候，才會寫入，需用 flush() 把剩餘的資料沖到目的地
        fw.flush();
        fw.close();
    }
}
