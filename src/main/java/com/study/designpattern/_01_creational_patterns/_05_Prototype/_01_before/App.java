package com.study.designpattern._01_creational_patterns._05_Prototype._01_before;

public class App {

    public static void main(String[] args) {


        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        //TODO clone != githubIssue
        //TODO clone.equals(githubIssue) => True
        // -> 새로운 인스턴스이기 때문에 다르지만 안에있는 내용은 같기 때문에 True가 나와야 함.
//        GithubIssue githubIssue2 = githubIssue.clone();
    }
}
