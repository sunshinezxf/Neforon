<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/19/15
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="${path.concat('/material/css/manage.css')}"/>
    <title>管理操作后台</title>
</head>
<body>
<header class="admin-header">
    <div class="header-brand">
        <strong>Neforon</strong>
        <small>后台管理系统</small>
    </div>
    <div class="header-collapse">
        <ul class="header-list">
            <li><a class="username">${username}</a></li>
            <li><a href="#">退出</a></li>
        </ul>
    </div>
</header>
<div class="ui-content">
    <div class="admin-navigator">
        <div class="operation-list">
            <ul class="admin-operation-list">
                <li>
                    <a>Neforon·扫码指南</a>
                </li>
                <li>
                    <a>Neforon·新建楼盘</a>
                </li>
                <li>
                    <a>Neforon·管理楼盘</a>
                </li>
            </ul>
        </div>
    </div>
</div>

</body>
</html>
