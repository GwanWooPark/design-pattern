package com.study.designpattern._02_structual_patterns._06_flywight._02_after;

// Flyweight(intrinsic)
// Flyweight에 해당하는 instance는 immutable해야함.(공유 객체이기 때문)
// class 에 final(상속 불가능)
public final class Font {

    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }
}
