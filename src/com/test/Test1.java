package com.test;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {
        String path = "D:\\Idea\\Code\\javase_01\\src\\com\\test\\b.txt";
        File file = new File(path);
        OutputStream os = new FileOutputStream(file, true);
        InputStream is = new FileInputStream(file);
        int b = 0;
        while ((b = is.read()) != -1) {
            os.write("-".getBytes());
            System.out.println("11111111111");
        }
        os.close();
        is.close();

    }
}