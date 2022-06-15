package com.study.designpattern._02_structual_patterns._07_proxy._03_java;

import com.study.designpattern._02_structual_patterns._07_proxy._02_after.DefaultGameService;
import com.study.designpattern._02_structual_patterns._07_proxy._02_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
    }

    // Runtime에 Proxy에 동적으로 생성
    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[] {GameService.class}, ((proxy, method, args) -> {
                    System.out.println("Hello dynamic proxy");
                    // 메소드가 실행하는데 어떤 인스턴스에 있는 메소드가 실행되냐(target)
                    // 메소드가가 실행할 때 넘겨지는 파라미터
                    method.invoke(target, args);
                    return null;
                }));
    }
}