<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/8/1
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>编辑主题</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="an">
    <fieldset class="g"><font size="3" color="white">修改主题</font></fieldset>
    <br/>
    <form action="${pageContext.request.contextPath}/subject/doUpdateSub" method="post">
        原主题序号: <input type="text" name="subId"><br/><br/>
        新主题名称：<input type="text" name="subTitle"><br/><br/>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
    <br>
    <hr>
    <br/>
    <form action="${pageContext.request.contextPath}/subject/doDeleteSub" method="post">
        <fieldset class="g"><font size="3" color="white">删除主题</font></fieldset>
        <br/>
        主题名称:<input type="text" name="dTitle"><br/><br/>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>
