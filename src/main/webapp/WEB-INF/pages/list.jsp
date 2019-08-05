<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/7/30
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css" />
</head>
<body>
<%@ include file="top.jsp" %>
<div class="i">
    <fieldset class="a">
        管理员：<a href="login.html">登录</a>
        <a href="">退出</a>
    </fieldset>
</div>

<div id="contain">
    <div class="b">
        <ul>
            <li><a href="addNews.html" target="htmlform">添加新闻</a></li>
            <li><a href="updateNews.html" target="htmlform">编辑新闻</a></li>
            <li><a href="addSubject.html" target="htmlform">添加主题</a></li>
            <li><a href="updateSubject.html" target="htmlform">编辑主题</a></li>
        </ul>
    </div>
    <div id="content">
        <iframe frameborder="0" class="iframeContent" name="htmlform"></iframe>
    </div>
</div>
</body>
</html>
