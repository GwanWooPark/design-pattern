package com.study.designpattern._03_behavioral_patterns._08_state._01_before;

public class Client {

    public static void main(String[] args) {
        Student park = new Student("park");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student gwan = new Student("gwan");
        gwan.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(park);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(gwan);

        onlineCourse.addReview("hello", park);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
