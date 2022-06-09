package com.study.designpattern._02_structual_patterns._04_decorator._02_after;

// Concrete component
public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
