<%--
  Created by IntelliJ IDEA.
  User: MJS
  Date: 2021/11/2
  Time: 0:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>当前有<span style="color: blue"><%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span>人在线</h1>
  </body>
</html>
