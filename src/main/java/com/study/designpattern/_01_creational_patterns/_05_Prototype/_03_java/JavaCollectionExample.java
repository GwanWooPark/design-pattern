package com.study.designpattern._01_creational_patterns._05_Prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student gwanwoo = new Student("gwanwoo");
        Student proto = new Student("proto");
        List<Student> students = new ArrayList<>();
        students.add(gwanwoo);
        students.add(proto);

        // 가장 많이 쓰이는 방법 (생성자 이용, shallow copy)
        // 엄밀히 하면 프로토 타입 패턴을 사용하는 것은 아니다
        List<Student> clone = new ArrayList<>(students);

        /**
         * 이 방법은 자주 쓰이지 않음
         * 1. 보통 변수의 타입을 지정할 때 가능한한 추상적인 타입을 사용하기 때문이다(유연성)
         *
         */
//        ArrayList<Student> clone = (ArrayList<Student>) students.clone();
        System.out.println(clone);
    }
}
