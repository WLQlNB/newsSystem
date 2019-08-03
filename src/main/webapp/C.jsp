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
    		Cookie c1=new Cookie("1111","www");
    		Cookie c2=new Cookie("11213","llll");
    		response.addCookie(c1);
    		response.addCookie(c2);
    	%>
 	</body>
</html>