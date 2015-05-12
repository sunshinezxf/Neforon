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
                <form action="${path.concat('/neforon/submit')}" method="post" enctype="multipart/form-data">
                    <input type="hidden" name="projectName" value="${projectName}"/>

                    <div class="qrcode-pic-editor">

                        <h2 class="sub-header">楼盘二维码</h2>

                        <div class="row">
                            <div class="col-xs-6 col-sm-3 placeholder">
                                <input type="file" class="form-control alert-info" name="qrPic"/>
                            </div>
                        </div>
                    </div>

                    <div class="qrcode-guidance-editor">
                        <h2 class="sub-header">扫码指南</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>扫码标题：</label>

                                <input type="text" class="form-control alert-info" name="guidanceTitle"
                                       placeholder="扫码指南标题"/>
                                <br/>
                                <label>扫码步骤：</label>

                                <input type="text" class="form-control" name="guidanceStep1"
                                       value="${template.guidanceDetail[0]}"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep2"
                                       value="${template.guidanceDetail[1]}"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep3"
                                       value="${template.guidanceDetail[2]}"/>
                                <br/>
                                <input type="text" class="form-control" name="guidanceStep4"
                                       value="${template.guidanceDetail[3]}"/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <div class="earn-approach-editor">
                        <h2 class="sub-header">赚钱方法</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>赚钱宣传标语：</label>
                                <input type="file" class="form-control alert-info" name="earnSlogan"/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <div class="price-editor">
                        <h2 class="sub-header">楼盘价格</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>楼盘名称</label>
                                <input type="text" class="form-control" name="companyName" value="${projectName}"/>
                                <br/>
                                <label>均价(单位：元/平方米)</label>
                                <input type="number" class="form-control alert-info" name="avgPrice"
                                       placeholder="多少元每平米">
                                <br/>
                                <label>楼盘状态</label>
                                <input type="text" class="form-control" name="activityStatus" value="开盘热销中">
                            </div>
                        </div>
                    </div>

                    <div class="premise-view-editor">
                        <h2 class="sub-header">楼盘全景</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <input type="file" class="form-control alert-info" name="premisePic"/>
                            </div>
                        </div>
                    </div>

                    <div class="coupon-editor">
                        <h2 class="sub-header">优惠设置</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>优惠内容：</label>
                                <input type="text" class="form-control alert-info" name="couponDetail"/>
                                <br/>
                            </div>
                        </div>
                    </div>

                    <div class="premise-intro-editor">
                        <h2 class="sub-header">楼盘介绍</h2>

                        <div class="row">
                            <div class="col-xs-10 placeholder">
                                <c:forEach var="item" varStatus="status" begin="1" end="15">
                                    <div class="row" id="premiseIndex${status.index}" style="">
                                        <textarea type="text"
                                                  class="form-control alert-info"
                                                  id="premiseAdvantage${status.index}"
                                                  name="premiseAdvantage${status.index}"
                                                  style="width: 60%; margin: 0 20px;"></textarea>
                                        <br/>
                                    </div>
                                </c:forEach>
                                <a href="javascript:void(0);" class="btn btn-success" id="add-line">添加一行</a>
                                <a href="javascript:void(0);" class="btn btn-danger" id="del-line">删除一行</a>
                            </div>
                        </div>
                    </div>

                    <div class="house-type-editor">
                        <h2 class="sub-header">户型鉴赏</h2>

                        <div class="row">
                            <div class="col-xs-6 placeholder">
                                <label>户型图：</label>
                                <input type="file" class="form-control alert-info" name="houseTypePic"/>
                                <br>
                                <label>项目地址：</label>
                                <input type="text" class="form-control alert-info" name="projectAddress"
                                       placeholder="项目地址"/>
                            </div>
                        </div>
                    </div>

                    <div class="submit-btn">
                        <input type="submit" class="btn btn-success" value="提交"/>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="${path.concat('/material/js/jquery-1.11.1.js')}"></script>
<script src="${path.concat('/material/js/bootstrap.min.js')}"></script>
<script src="${path.concat('/material/js/holder.js')}"></script>
<script src="${path.concat('/material/js/template.js')}"></script>
</body>
</html>
