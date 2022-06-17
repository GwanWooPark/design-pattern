package com.study.designpattern._03_behavioral_patterns._04_iterator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Concrete Iterator
public class RecentPostIterator implements Iterator<Post> {

    private Iterator<Post> internalIterator;

    private Board board;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return internalIterator.next();
    }
}
