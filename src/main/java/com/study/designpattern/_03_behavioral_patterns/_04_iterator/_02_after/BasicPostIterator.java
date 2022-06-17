package com.study.designpattern._03_behavioral_patterns._04_iterator._02_after;

import java.util.Iterator;
import java.util.List;

// Concrete Iterator
public class BasicPostIterator implements Iterator<Post>{

    Iterator<Post> basicIterator;

    public BasicPostIterator(List<Post> posts) {
        this.basicIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return basicIterator.hasNext();
    }

    @Override
    public Post next() {
        return basicIterator.next();
    }
}
