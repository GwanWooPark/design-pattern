package com.study.designpattern._02_structual_patterns._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        // 가변인자
        // 배열을 넘겼지만 List로 받음
        // Collections
        List<String> strings = Arrays.asList("a", "b", "c", "d");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("adapter.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
