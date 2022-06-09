package com.study.designpattern._02_structual_patterns._04_decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    // 편의상 메인 메서드를 Client에 넣어놓음, Client 외부에 있다고 보면 됨
    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("마블...");
        client.writeComment("http://notion.so");
    }
}
