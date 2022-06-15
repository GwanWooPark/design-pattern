package com.study.designpattern._03_behavioral_patterns._01_chain_of_responsibility._03_java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// hello라는 요청에 이 필터를 적용하겠다
@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터 시작(전처리)");
        chain.doFilter(request, response);
        System.out.println("후처리");
    }
}
