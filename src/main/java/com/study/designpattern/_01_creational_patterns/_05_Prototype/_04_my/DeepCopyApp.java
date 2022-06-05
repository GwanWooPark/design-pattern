package com.study.designpattern._01_creational_patterns._05_Prototype._04_my;

public class DeepCopyApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        IronmanConfig config = new IronmanConfig();
        config.setAttk(100);
        config.setDefense(90);

        Ironman ironman = new Ironman(config);
        ironman.setType("1호");
        ironman.setVersion("0.0.1");

        System.out.println(ironman);

        Ironman ironman2 = (Ironman) ironman.clone();
        // 깊은 복사로 인해 객체 값 자체가 복사되었기 때문에 값이 변경되지 않는다.
        config.setAttk(150);
        ironman2.setVersion("0.0.2");
        ironman2.setType("2호");


        System.out.println(ironman2);

        System.out.println(ironman != ironman2);
        System.out.println(ironman.equals(ironman2));
        System.out.println(ironman.getClass() == ironman2.getClass());
        System.out.println(ironman.getIronmanConfig() == ironman2.getIronmanConfig());
    }
}
