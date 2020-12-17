package com.test;

import java.io.*;
import java.util.*;

public class Test {
    @SuppressWarnings("deprecation")

    public static void main(String[] args) throws IOException {
        List list = new ArrayList();
        list.add(9);
        String path = "D:\\Idea\\Code\\javase_01\\src\\com\\test\\b.txt";
        File file = new File(path);
        InputStream is = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(is);
        is.read();
        Properties properties = new Properties();
        properties.load(is);
        Set<String> strings = properties.stringPropertyNames();
        Enumeration<?> enumeration = properties.propertyNames();
        Object o = null;
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
  /*      for (String str : strings
             ) {
            System.out.println(str+"   "+properties.getProperty(str));
        }*/


    }
}