package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._03_java;

import javax.servlet.*;
import java.io.IOException;

public class CoRInJava {

    public static void main(String[] args) {
        Filter filter = new Filter() {
            // servlet container로 들어오는 요청을 필터링하는 메소드
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                // TODO 전처리
                chain.doFilter(request, response);
                // TODO 후처리

            }
        };
    }
}
