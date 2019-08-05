<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/7/30
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%@ include file="top.jsp" %>
<div class="an">
    <form action="" method="post">
        新闻名称:<input type="text" name="newsname"><br/><br/>
        新闻内容<br><textarea class="addnews"></textarea><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>
