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
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Neforon后台管理</title>
    <link rel="stylesheet" type="text/css" href="${path.concat('/material/css/bootstrap.min.css')}"/>
    <link rel="stylesheet" type="text/css" href="${path.concat('/material/css/dashboard.css')}"/>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">Neforon后台管理</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">总览</a></li>
                <li><a href="#">退出</a></li>
                <li><a href="#">帮助</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="搜索...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">总览 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">扫码管理</a></li>
                <li><a href="#">楼盘管理</a></li>
                <li><a href="#">添加楼盘</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">总览</h1>

            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder">
                    <h4>扫码管理</h4>
                    <span class="text-muted">二维码扫码指南</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <h4>楼盘管理</h4>
                    <span class="text-muted">已有楼盘信息的管理</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <h4>添加楼盘</h4>
                    <span class="text-muted">添加新的楼盘信息</span>
                </div>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <h4>寻求帮助</h4>
                    <span class="text-muted">请联系sunshinezxf@me.com</span>
                </div>
            </div>

            <h2 class="sub-header">扫码指南</h2>

            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Neforon扫码标题</th>
                        <th>标题内容描述</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>标题</td>
                        <td></td>
                    </tr>
                    </tbody>
                </table>
                <br/>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Neforon扫码指南</th>
                        <th>步骤内容描述</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>Lorem</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="${path.concat('/material/js/bootstrap.min.js')}"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="${path.concat('/material/js/holder.js')}"></script>
</body>
</html>
