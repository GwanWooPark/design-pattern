package com.study.designpattern._03_behavioral_patterns._06_memento._01_before;

public class Client {

    public static void main(String[] args) {

        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        int redTeamScore = game.getRedTeamScore();
        int blueTeamScore = game.getBlueTeamScore();

        /*
            encapsulation이 깨진 상태
            Client가 게임의 내부 정보가 뭐가 있는지 일일이 알고 있어야 함.
             --> 이 자체가 문제(내부 정보 의존하고 있기 때문에 무언가가 바뀌게 되면 Client의 코드가 변경이 된다)
         */
        Game restoredGame = new Game();
        restoredGame.setRedTeamScore(redTeamScore);
        restoredGame.setBlueTeamScore(blueTeamScore);
    }
}
