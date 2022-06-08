package com.study.designpattern._02_structual_patterns._02_bridge._04_my;

public class Computer extends DefaultDevice {

    public Computer(OS os) {
        super(os, "컴퓨터");
    }
}
