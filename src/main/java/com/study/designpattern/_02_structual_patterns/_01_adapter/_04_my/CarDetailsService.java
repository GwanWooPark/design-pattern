package com.study.designpattern._02_structual_patterns._01_adapter._04_my;

// Target
public interface CarDetailsService {
    CarDetails loadByType(String type);
}
