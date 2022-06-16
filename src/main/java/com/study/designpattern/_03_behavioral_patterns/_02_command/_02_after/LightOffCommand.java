package com.study.designpattern._03_behavioral_patterns._02_command._02_after;

// Concrete Command
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
