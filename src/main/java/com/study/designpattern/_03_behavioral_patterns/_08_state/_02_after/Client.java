package com.study.designpattern._03_behavioral_patterns._08_state._02_after;

public class Client {

    public static void main(String[] args) {

        OnlineCourse onlineCourse = new OnlineCourse();
        Student park = new Student("park");
        Student lee = new Student("lee");
        lee.addPrivate(onlineCourse);

        onlineCourse.addStudent(park);

        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", park);
        onlineCourse.addStudent(lee);


        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }
}
