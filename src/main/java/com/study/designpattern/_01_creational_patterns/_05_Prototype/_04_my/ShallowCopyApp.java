package com.study.designpattern._01_creational_patterns._05_Prototype._04_my;

public class ShallowCopyApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        IronmanConfig config = new IronmanConfig();
        config.setAttk(100);
        config.setDefense(90);

        Ironman ironman = new Ironman(config);
        ironman.setType("1호");
        ironman.setVersion("0.0.1");

        System.out.println(ironman);

        Ironman clone = (Ironman) ironman.clone();
        config.setAttk(150);


        System.out.println(clone);

        System.out.println(ironman != clone);
        System.out.println(clone.equals(ironman));
        System.out.println(ironman.getClass() == clone.getClass());
        System.out.println(ironman.getIronmanConfig() == clone.getIronmanConfig());
    }
}
