package com.study.designpattern._02_factory.myfactory._02_after;

public class Interviewee {

    private String name;
    private String company;
    private String resume;

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Interviewee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", resume='" + resume + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

}
