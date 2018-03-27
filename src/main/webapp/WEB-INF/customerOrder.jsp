<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../includes/menu.jsp" %>
        <h1>your order!</h1>
        <p>your length ${l}</p>
        <p>your width ${w}</p>
        <p>your height ${h}</p>
        
        <p><%=  request.getAttribute("bricks") %></p>

        <a href="index.jsp">Click here to go back home</a>
    </body>
</html>

<%--  <p><%=// request.getAttribute("h") %></p> --%>