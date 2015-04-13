<%--
  Created by IntelliJ IDEA.
  User: sunshine
  Date: 4/6/15
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="material/css/premise.css">
    <title>AWifi广告页</title>
</head>
<body>
<div class="page">
    <div class="ui-content">
        <!-- 二维码区域 -->
        <div class="qr-code">
            <div class="qr-pic-wrapper">
                <img class="qr-pic" src="material/qrcode/example.png"/>
            </div>
            <div class="description">
                <h3>二维码内扫加关注方法</h3>

                <p class="desc-qr-method">1、&nbsp;&nbsp;截屏二维码并保存至手机相册。</p>

                <p class="desc-qr-method">2、&nbsp;&nbsp;打开您的微信，点击右上角"+"，点击"扫一扫"。</p>

                <p class="desc-qr-method">3、&nbsp;&nbsp;进入"扫一扫界面"，点击右上角"相册"，选中刚保存的二维码图片。</p>

                <p class="desc-qr-method">4、&nbsp;&nbsp;点击"关注"。</p>
            </div>
        </div>
        <!-- 二维码区域结束 -->

        <!-- 赚钱的方法可真多区域 -->
        <div class="approach-money">
            <!-- xx喊你来赚钱区域 -->
            <div class="slogan">
                <div class="slogan-company">万科喊你一起去赚钱</div>
                <div class="slogan-theme">赚钱的方法可真多!</div>
            </div>
            <!-- xx喊你来赚钱区域结束 -->
            <div class="earn-money-details">
                <div class="earn-money-method-desc">手机点一点，转发来赚钱</div>
                <div class="earn-money-method-desc">手机写一写，带看来赚钱</div>
                <div class="earn-money-method-desc">手机拨一拨，约上亲友来赚钱</div>
                <div class="earn-money-method-desc">手机扫一扫，签到来赚钱</div>
            </div>
        </div>
        <!-- 赚钱的方法可真多区域结束 -->

        <!-- 楼盘均价 -->
        <div class="price">
            <span class="price-premise">万科·新都会</span>
            <span class="avg-price">均价21000元/平方米</span>
            <span class="status">开盘热销中</span>
        </div>
        <!-- 楼盘均价结束 -->

        <!-- 楼盘图片展示区域 -->
        <div class="premise-pic-area">
            <img class="premise-pic" src="material/buildview/wanke.png"/>
        </div>
        <!-- 楼盘图片展示区域结束-->

        <!-- 优惠展示区域 -->
        <div class="coupon">
            <h3 class="title">买多少，送多少!</h3>

            <p class="detail">付1万元，总房款立减3万元</p>
        </div>
        <!-- 优惠区域结束-->

        <!-- 卖点展示区域 -->
        <div class="selling-characters">
            <div class="sell-header">
                <img class="sell-house" src="material/img/house.png"/>
                <span class="sell-title">楼盘介绍</span>
            </div>

            <ul class="selling-character-desc">
                <li>区位优势：南京南站为核心的宁南地区，将成为未来发展空间最大，势头最猛的地区。</li>
                <li>配套优势：10分钟成熟生活圈，汇聚永辉超市、商场、特色餐饮、KTV、中影国际影城等。</li>
                <li>景观优势：一条"时光漫步道"连贯多个主题景观团。成长乐园、醒晨吧，给孩子和老人预留的不同主题户外活动空间，享更多鲜氧运动。</li>
                <li>交通优势：南京南站，汇聚4条地铁线（1、3号线运行中）、6条城市快速通道、25条公交线。</li>
            </ul>
            <br/>
        </div>
        <!-- 卖点展示区域结束 -->

        <!-- 户型展示区域 -->
        <div class="premise-type">
            <div class="premise-type-header">
                <img class="header-pic" src="material/img/wheel.png"/>
                <span class="header">户型鉴赏</span>
            </div>
            <img class="type-pic" src="material/type/wanke.png"/>

            <div class="project-address">
                <p class="address">项目地址：金阳西街（南京南站南侧梅香路以西）</p>
            </div>
            <br>
        </div>
        <!-- 户型展示区域结束 -->
    </div>
</div>
</body>
</html>
