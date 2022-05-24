package com.study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Settings settings = Settings.getInstance();
        Settings settings1 = null;

        // 직렬화 & 역직렬화 : 저장할 때 직렬화, 읽어들일 때는 역직렬화
//                         객체를 파일로 저장해 놓았다가 다시 로딩할 수 있음
//                         역직렬화를 하면 반드시 생성자를 사용해서 인스턴스를 만든다
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings1 = (Settings) in.readObject();
        }



        // 리플렉션: Singleton을 깨는 첫 번째 방법, 대응 불가
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings = constructor.newInstance();

        System.out.println(settings == settings1);
    }
}
