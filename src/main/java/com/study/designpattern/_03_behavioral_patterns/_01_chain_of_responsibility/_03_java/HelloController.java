package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._03_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// hello라는 요청을 처리하겠다
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
