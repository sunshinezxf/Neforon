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
                <li><a href="#">楼盘管理</a></li>
                <li><a href="#">添加楼盘</a></li>
                <li><a href="#">历史楼盘</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header"> ${projectName}</h1>
            <br/>

            <div clas="premise-template">
                <form>
                    <div class="qrcode-pic-editor">

                        <h2 class="sub-header">楼盘二维码</h2>

                        <div class="row">
                            <div class="col-xs-6 col-sm-3 placeholder">
                                <input type="file" class="form-control" name="qrPic"/>
                            </div>
                        </div>
                    </div>

                    <div class="qrcode-guidance-editor">
                        <h2 class="sub-header">扫码指南</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>扫码标题：</label>
                                <input type="text" class="form-control" name="guidanceTitle" placeholder="扫码指南标题"/>
                                <br/>
                                <label>扫码步骤：</label>
                                <input type="text" class="form-control" name="guidanceStep1" placeholder="扫码步骤一"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep2" placeholder="扫码步骤二"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep3" placeholder="扫码步骤三"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep4" placeholder="扫码步骤四"/>
                                <br/>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<script src="${path.concat('/material/js/bootstrap.min.js')}"></script>
<script src="${path.concat('/material/js/holder.js')}"></script>
</body>
</html>
