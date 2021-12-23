package com.mjs.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Objects;

/**
 * @author MJS
 * @description 描述
 * @date 2021/11/3 0:29
 */
public class OnlineCountListener implements HttpSessionListener {

    /**
     * 创建session的监听，一旦创建session，就会触发一次这个方法
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
        System.out.println(httpSessionEvent.getSession().getId());
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if (Objects.isNull(onlineCount)) {
            onlineCount = 1;
        } else {
            onlineCount++;
        }

        servletContext.setAttribute("OnlineCount", onlineCount);
    }

    /**
     * 销毁session的监听
     * @param httpSessionEvent
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }

    /**
     * session销毁：1、手动销毁，session.invilate()
     *             2、session配置（在web.xml中）
     */
}
