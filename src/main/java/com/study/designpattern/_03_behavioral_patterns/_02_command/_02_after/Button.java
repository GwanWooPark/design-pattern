package com.study.designpattern._03_behavioral_patterns._02_command._02_after;

// Invoker
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
        button.press();

    }
}
