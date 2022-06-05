package com.study.designpattern._01_creational_patterns._05_Prototype._04_my;

public class IronmanConfig {

    private int attk;
    private int defense;

    public int getAttk() {
        return attk;
    }

    public void setAttk(int attk) {
        this.attk = attk;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "IronmanConfig{" +
                "attk='" + attk + '\'' +
                ", defense='" + defense + '\'' +
                '}';
    }
}