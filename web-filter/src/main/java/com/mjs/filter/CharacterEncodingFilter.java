package com.mjs.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author MJS
 * @description 描述
 * @date 2021/11/2 1:01
 */
public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter已经初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");

        //让请求继续走下去，不然程序在这里会被拦截停止
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter已经初销毁了");
    }
}
