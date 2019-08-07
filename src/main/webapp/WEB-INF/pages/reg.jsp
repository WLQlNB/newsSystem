<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/8/5
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="top.jsp"%>
    <div>
        <form action="${pageContext.request.contextPath }/user/doReg" method="post">
            姓名：<input type="text" name="userName"><br>
            性别：<input type="text" name="userSex"><br>
            密码：<input type="password" name="userPwd"><br>
            <input type="submit" value="确定">
        </form>
    </div>
</body>
</html>
