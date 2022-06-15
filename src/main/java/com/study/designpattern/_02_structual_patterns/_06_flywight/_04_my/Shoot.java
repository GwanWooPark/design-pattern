package com.study.designpattern._02_structual_patterns._06_flywight._04_my;

// Client
public class Shoot {

    public static void main(String[] args) {

        BulletFactory bulletFactory = new BulletFactory();
        Bullet yellow_bullet_50 = new Bullet(50, bulletFactory.getBullet("ak24,yellow"));
        Bullet yellow_bullet_30 = new Bullet(30, bulletFactory.getBullet("ak24,yellow"));
        Bullet yellow_bullet_40 = new Bullet(40, bulletFactory.getBullet("ak24,yellow"));
        Bullet red_bullet_50 = new Bullet(50, bulletFactory.getBullet("ak24,red"));
        Bullet blue_bullet_50 = new Bullet(50, bulletFactory.getBullet("ak24,blue"));
        Bullet yellow_bullet_60 = new Bullet(60, bulletFactory.getBullet("ak24,yellow"));

    }
}
