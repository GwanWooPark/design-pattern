package com.study.designpattern._03_behavioral_patterns._08_state._02_after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
