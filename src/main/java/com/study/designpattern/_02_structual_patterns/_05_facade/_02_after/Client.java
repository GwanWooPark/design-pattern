package com.study.designpattern._02_structual_patterns._05_facade._02_after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("park");
        emailMessage.setTo("gwanwoo");
        emailMessage.setSubject("자바 공부");
        emailMessage.setText("열심히 하자");
        emailSender.sendEmail(emailMessage);
    }
}
