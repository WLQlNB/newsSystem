<%--
  Created by IntelliJ IDEA.
  User: WLQ
  Date: 2019/7/30
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%@ include file="top.jsp" %>
<script type="text/javascript">
    function login() {

    }
</script>

<img src="pageContext.request.contextPathpageContext.request.contextPath/img/logo.JPG" height="52" alt="中国新闻网"
     align="left">
<img src="pageContext.request.contextPath/img/2.JPG" width="139" height="22" alt="中国新闻网">
<form action="" method="post">
    <div class="login">
        <tr>
            用户名:<input type="text" name="id" placeholder="请输入用户名">
            密&nbsp;&nbsp;码：<input type="text" name="pwd" placeholder="请输入密码">
            <input type="submit" value="登录"/>
            <button type="button" onclick="location.href">注册</button>
        </tr>
    </div>
</form>
<br>
<center>
    <img src="pageContext.request.contextPath/img/1.JPG" width="770" height="90" border="0" alt="">
</center>

<div class="z">
    <a href="https://www.chinanews.com/">国内</a>
    <a href="http://world.huanqiu.com/?agt=15438">国际</a>
    <a href="http://mil.huanqiu.com/?agt=15438">军事</a>
    <a href="https://sports.qq.com/">体育</a>
    <a href="https://ent.sina.com.cn/">娱乐</a>
    <a href="http://society.people.com.cn/">社会</a>
    <a href="http://www.caijing.com.cn/">财经</a>
    <a href="https://tech.163.com/">科技</a>
    <a href="http://health.people.com.cn/">健康</a>
    <a href="https://www.autohome.com.cn/beijing/">汽车</a>
    <a href="http://www.aaa-cg.com.cn/">教育</a>
    <a href="https://www.fang.com/">房产</a>
    <a href="http://www.jia360.com/">家居</a>
    <a href="https://go.hao123.com/">旅游</a>
    <a href="http://culture.people.com.cn/">文化</a>
    <a href="https://cn.58.com/">其他</a>
    <a href="https://tech.qq.com/science.htm">探索</a>
    <a href="http://www.5linglei.com/">另类</a>
</div>
<hr/>

<div class="news">

</div>

<div class="textarea">
    <fieldset class="g"><font color="white" size="5">国内新闻</font></fieldset>
    <br/>
    <textarea class="countryarea"></textarea>
</div>

<div class="textarea">
    <fieldset class="g"><font color="white" size="5">国际新闻</font></fieldset>
    <br/>
    <textarea class="countryarea"></textarea>
</div>
</body>
</html>
