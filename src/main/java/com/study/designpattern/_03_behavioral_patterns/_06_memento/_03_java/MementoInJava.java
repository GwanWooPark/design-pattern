package com.study.designpattern._03_behavioral_patterns._06_memento._03_java;

import com.study.designpattern._03_behavioral_patterns._06_memento._01_before.Game;

import java.io.*;
import java.util.Date;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // TODO Date
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        date.setTime(time);

        // TODO Serializable
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        // TODO 직렬화
        try (FileOutputStream fileOut = new FileOutputStream("GameSave.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        // TODO 역직렬화
        try (FileInputStream fileIn = new FileInputStream("GameSave.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            game = (Game) in.readObject();
            System.out.println(game.getBlueTeamScore());
            System.out.println(game.getRedTeamScore());

        }
    }
}
