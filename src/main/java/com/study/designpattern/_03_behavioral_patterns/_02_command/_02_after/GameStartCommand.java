package com.study.designpattern._03_behavioral_patterns._02_command._02_after;

// Concrete Command
public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
