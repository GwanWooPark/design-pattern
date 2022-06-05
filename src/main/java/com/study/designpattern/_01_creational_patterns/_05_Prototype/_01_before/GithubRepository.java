package com.study.designpattern._01_creational_patterns._05_Prototype._01_before;

public class GithubRepository {

    private String user;
    private String name;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GithubRepository{" +
                "user='" + user + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
