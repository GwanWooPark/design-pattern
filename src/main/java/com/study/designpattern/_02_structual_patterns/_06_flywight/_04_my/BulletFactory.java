package com.study.designpattern._02_structual_patterns._06_flywight._04_my;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private Map<String, BulletType> bulletCache = new HashMap();

    public BulletType getBullet(String bulletType) {

        if (bulletCache.containsKey(bulletType)) {
            System.out.println("공유 객체를 통한 총알 생성");
            System.out.println(bulletCache.get(bulletType));
            return bulletCache.get(bulletType);
        } else {
            String[] split = bulletType.split(",");
            BulletType newBulletType = new BulletType(split[0], split[1]);
            bulletCache.put(bulletType, newBulletType);
            System.out.println(split[0] + " " +  split[1] + " 타입의 새로운 총알 생성..");
            System.out.println(bulletCache.get(bulletType));

            return newBulletType;
        }
    }
}
