package com.study.designpattern._02_structual_patterns._04_decorator._03_java;

import com.study.designpattern._02_structual_patterns._03_composite._01_before.Bag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // Collections가 제공하는 데코레이터 메소드
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());

    }

    private static class Book {

    }

    private static class Item {

    }
}
