package com.study.designpattern._02_structual_patterns._06_flywight._04_my;

// extrinsic
public class Bullet {

    private int speed;
    private BulletType bulletType;

    public Bullet(int speed, BulletType bulletType) {
        this.speed = speed;
        this.bulletType = bulletType;
    }
}
