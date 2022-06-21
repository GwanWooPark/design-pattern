package com.study.designpattern._03_behavioral_patterns._10_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Template
public abstract class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    // Template method
    public int process() {

        // try() 안에 소스를 작성하면 finally를 통해서 close를 해주지 않아도 된다.(auto call)
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    // protected: 하위 클래스 변경 가능
    protected abstract int getResult(int result, int number);
}
