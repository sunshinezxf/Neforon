<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/6/15
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="material/css/manage.css">
    <title>管理页面</title>
</head>
<body>
<div class="page">
    <div class="ui-content">
        <div class="header">
            <h1>Neforon楼盘管理</h1>
            <hr>
        </div>
        <div class="login">
            <h3>登 &nbsp; &nbsp;录</h3>

            <div class="authentication">
                <form class="login-form" action="${path.concat('/neforon/authen')}" method="post">
                    <div class="form-unit">
                        <label for="username" class="username">用户名：</label>
                        <input type="text" name="username" id="username" value=""/>
                        <br/>
                    </div>
                    <div class="form-unit">
                        <label for="password" class="password">密&nbsp; &nbsp;码：</label>
                        <input type="password" name="password" id="password" value=""/>
                        <br/>
                    </div>

                    <div class="confirm">
                        <input type="submit" value="登录"/>
                    </div>
                </form>
            </div>
        </div>
        <footer class="bottom-footer">&copy; &nbsp; sunshinezxf@me.com</footer>
    </div>
</div>
</body>
</html>
