<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/8/1
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加主题</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="an">
    <form action="" method="post">
        主题名称:<input type="text" name="newsname"><br/><br/>
        主题内容<br><textarea class="addnews"></textarea><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>
