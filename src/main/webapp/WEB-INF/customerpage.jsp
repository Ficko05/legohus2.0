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

        <p>the minimum house size is 6 x 6</p>
        
        <form name="calculate_bricks" action="FrontController" method="post">
            <input type="hidden" name="command" value="calculate_bricks">
            <label>width</label>
            <input type="text"   name="width" value="6" />
            <label>length</label>
            <input type="text"  name="length" value="6" />
            <label>height</label>
            <input type="text"  name="height" value="1" />

            <input type="submit" name="submit" />

            <br>


        </form>


    </body>
</html>
