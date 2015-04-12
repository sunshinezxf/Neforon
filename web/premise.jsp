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
    <link rel="stylesheet" type="text/css" media="screen" href="${path.concat('/material/css/premise.css')}">
    <title>${premise.premiseName}</title>
</head>
<body>
<div class="page">
    <div class="ui-content">
        <!-- 二维码区域 -->
        <div class="qr-code">
            <div class="qr-pic-wrapper">
                <img class="qr-pic" src="${path}${premise.qrCode}"/>
            </div>
            <div class="description">
                <h3>${premise.guidanceTitle}</h3>

                <c:forEach var="item" items="${premise.guidanceDetail}" varStatus="num">
                    <p class="desc-qr-method">
                        <c:out value="${num.index + 1}"></c:out>、&nbsp;&nbsp;
                        <c:out value="${item}"></c:out>。
                    </p>
                </c:forEach>

            </div>
        </div>
        <!-- 二维码区域结束 -->

        <!-- 赚钱的方法可真多区域 -->
        <div class="approach-money">
            <!-- xx喊你来赚钱区域 -->
            <div class="slogan">
                <div class="slogan-company">${premise.earnCompany}</div>
                <div class="slogan-theme">${premise.earnSlogan}</div>
            </div>
            <!-- xx喊你来赚钱区域结束 -->
            <div class="earn-money-details">
                <c:forEach var="item" items="${premise.earnMethods}" varStatus="num">
                    <div class="earn-money-method-desc"><c:out value="${item}"></c:out></div>
                </c:forEach>
            </div>
        </div>
        <!-- 赚钱的方法可真多区域结束 -->

        <!-- 楼盘均价 -->
        <div class="price">
            <span class="price-premise">${premise.companyName}</span>
            <span class="avg-price">均价${premise.avgPrice}元/平方米</span>
            <span class="status">${premise.activityStatus}</span>
        </div>
        <!-- 楼盘均价结束 -->

        <!-- 楼盘图片展示区域 -->
        <div class="premise-pic-area">
            <img class="premise-pic" src="${path}${premise.premisePic}"/>
        </div>
        <!-- 楼盘图片展示区域结束-->

        <!-- 优惠展示区域 -->
        <div class="coupon">
            <h3 class="title">${premise.couponTitle}</h3>

            <p class="detail">${premise.couponDetail}</p>
        </div>
        <!-- 优惠区域结束-->

        <!-- 卖点展示区域 -->
        <div class="selling-characters">
            <div class="sell-header">
                <img class="sell-house" src="${path.concat('/material/img/house.png')}"/>
                <span class="sell-title">楼盘介绍</span>
            </div>

            <ul class="selling-character-desc">
                <c:forEach var="item" items="${premise.premiseAdvantages}">
                    <li><c:out value="${item}"></c:out>。</li>
                </c:forEach>
            </ul>
            <br/>
        </div>
        <!-- 卖点展示区域结束 -->

        <!-- 户型展示区域 -->
        <div class="premise-type">
            <div class="premise-type-header">
                <img class="header-pic" src="${path.concat('/material/img/wheel.png')}"/>
                <span class="header">户型鉴赏</span>
            </div>
            <img class="type-pic" src="${path}${premise.houseTypePic}"/>

            <div class="project-address">
                <p class="address">${premise.projectAddress}</p>
            </div>
            <br>
        </div>
        <!-- 户型展示区域结束 -->

    </div>
</div>
</body>
</html>

