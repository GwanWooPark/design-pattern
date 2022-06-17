package com.study.designpattern._03_behavioral_patterns._04_iterator._02_after;

import java.util.Iterator;


public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴");
        board.addPost("이터레이터 패턴 공부");
        board.addPost("패턴 적용 전");


        // TODO 들어간 순서대로 순회하기
        Iterator<Post> basicIterator = board.getBasicIterator();
        while (basicIterator.hasNext()) {
            System.out.println(basicIterator.next().getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }


    }
}
