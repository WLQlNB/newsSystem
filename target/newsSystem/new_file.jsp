<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<%
    		Cookie c[]=request.getCookies();
    		for (int i = 0; i<c.length; i++) {
    		    %>
    		    <h1> c[i].getValue</h1>
    		    <%
    		}
    	%>
 	</body>
</html>