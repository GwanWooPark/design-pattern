package com.study.designpattern._03_behavioral_patterns._06_memento._02_after;

public class Client {

    public static void main(String[] args) {

        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(30);
        game.setRedTeamScore(50);

        System.out.println(save.getBlueTeamScore());
        System.out.println(save.getRedTeamScore());

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());

        game.restore(save);
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
