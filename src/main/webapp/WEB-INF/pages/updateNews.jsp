<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/8/1
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>编辑新闻</title>

</head>
<body>
<div class="an">
    <fieldset class="g"><font size="3" color="white">修改新闻</font></fieldset>
    <form action="" method="post">
        新闻名称:<input type="text" name="newsname"><br/><br/>
        新闻内容<br><textarea class="addnews"></textarea><br>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
    <br>
    <hr>
    <br/>
    <form action="" method="post">
        <fieldset class="g"><font size="3" color="white">删除新闻</font></fieldset>
        新闻名称:<input type="text" name="newsjname"><br/><br/>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>
