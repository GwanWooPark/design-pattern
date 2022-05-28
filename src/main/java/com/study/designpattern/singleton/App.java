package com.study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton singleton = Singleton.getInstance();
        Singleton serializableSingleton = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))){
            out.writeObject(singleton);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))){
            serializableSingleton = (Singleton) in.readObject();
        }

        System.out.println(singleton != serializableSingleton);
    }
}
