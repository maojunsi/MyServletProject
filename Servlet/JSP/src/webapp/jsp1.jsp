<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page autoFlush="true" %>
<%@page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%=new Date()%>


<% for (int i = 0; i < 10; i++) {%>
<h1>hello jsp <%=i%>
</h1>
<% } %>

</body>
</html>
