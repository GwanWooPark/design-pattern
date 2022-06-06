package com.study.designpattern._01_creational_patterns._05_Prototype._04_my;

import java.util.Objects;

public class Ironman implements Cloneable{

    private IronmanConfig ironmanConfig;

    private String version;
    private String type;

    public Ironman(IronmanConfig ironmanConfig) {
        this.ironmanConfig = ironmanConfig;
    }


    public void setIronmanConfig(IronmanConfig ironmanConfig) {
        this.ironmanConfig = ironmanConfig;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IronmanConfig getIronmanConfig() {
        return ironmanConfig;
    }

    public String getSpec() {
        return String.format("공격력: %d, 방어력: %d", ironmanConfig.getAttk(), ironmanConfig.getDefense());
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep Copy
        IronmanConfig config = new IronmanConfig();
        config.setAttk(100);
        config.setDefense(90);

        Ironman ironman = new Ironman(config);
        ironman.setType(this.type);
        ironman.setVersion(this.version);

        return ironman;

        // Shallow Copy
//        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ironman that = (Ironman) o;
        return Objects.equals(ironmanConfig, that.ironmanConfig) && Objects.equals(version, that.version) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ironmanConfig, version, type);
    }

    @Override
    public String toString() {
        return "Ironman{" +
                "version='" + version + '\'' +
                ", type='" + type + '\'' +
                ", 공격력=" + ironmanConfig.getAttk() +
                ", 방어력=" + ironmanConfig.getDefense() +
                '}';
    }
}
