package com.study.designpattern.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    // 1. private로 생성자를 생성하면 클래스가 다르면 생성자를 사용할 수 없다.
    private Settings() {

    }

    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    // 2. return new 로 했기 때문에 다른 객체로 생성됨
//    public static Settings getInstance() {
//        return new Settings();
//    }

    // 3. 이 방법의 문제(멀티 쓰레드 환경에서 안전하지 못하다)
    //    하나의 쓰레드가 if 문을 통과할 때 비슷하게 instance가 생성되지 않은 시점에 다른 쓰레드가 if문을 통과하게 되면 2개의 instance가 생성됨

    /**
     * 4. 해결 방법
     * 1) synchronized : 한번에 하나의 쓰레드만 들어오게 하는 것 (단, getInstance를 실행할 때마다 동기화 처리 작업 때문에 성능의 저하가 있음)
     * 2) 이른 초기화(eager initialization): 미리 만드는 것(초기화 비용이 크지 않을 때)
     * private static final Settings INSTANCE = new Settings();
     * 장점: Thread Safe
     * 단점: instance를 만드는데 비용을 많이 소모 했지만, 사용하지 않을 때
     * 3) double checked locking(효율적인 동기화 블럭): 1.5 이상에서 사용됨
     * private static volatile Settings instance;
     * 4) static inner(권장되는 방법 중 1개):
     *
     * @return
     */
    public static Settings getInstance() {
        return SettingHolder.INSTANCE;
    }

    // 역직렬화 대응 방안
    protected Object readResolve() {
        return getInstance();
    }

}
