package com.study.designpattern._02_structual_patterns._03_composite._02_after;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Bag implements Component{

    // Leaf가 아닌 Component를 참조해야함//
//    private List<Item> items = new ArrayList<>();
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    // Client가 연산을 할 필요 없이 Bag에서 구한다.
    // 기선님 생각: 이게 맞다. 클라이언트가 지나치게 많은 걸 알지 않아도 된다(객체지향 적으로)
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
