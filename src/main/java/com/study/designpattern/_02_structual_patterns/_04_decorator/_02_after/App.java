package com.study.designpattern._02_structual_patterns._04_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;


    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            // SpamFilteringCommentDecorator가 DefaultCommentService를 감싼다.
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            // SpamFilteringCommentDecorator로 감싸진 DefaultCommentService를 한번 더 TrimmingCommentDecorator가 감싼다.
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어 게임");
        client.writeComment("이러다... 다 죽어!!");
        client.writeComment("http://notion.so/parkgw");
    }
}
