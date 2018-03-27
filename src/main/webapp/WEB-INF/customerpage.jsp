
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <%@include file="../includes/menu.jsp" %>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        
        <form name="calculate_bricks" action="FrontController" method="post">
               <input type="hidden" name="command" value="calculate_bricks">
            <label>width</label>
            <input type="text"   name="w" />
            <label>length</label>
            <input type="text"  name="l" />
            <label>height</label>
            <input type="text"  name="h" />
            
            <input type="submit" name="submit" />

            <br>

            <a href="index.jsp">Click here to go back home</a>
        </form>

        
    </body>
</html>
