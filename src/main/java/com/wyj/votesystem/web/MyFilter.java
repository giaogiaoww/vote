package com.wyj.votesystem.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器拦截之前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤器拦截之后");
    }
}
