<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/22
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Show Project</title>
</head>
<body>
<table  width="600px"; height="100px"; align="center"; cellspacing="0"; border="1"; >

<tr>
    <th>项目编号</th>
    <th>项目名称</th>
    <th>项目预算</th>
    <th>项目介绍</th>
    <th>详细信息</th>

</tr>
<a:forEach var="b" items="${list}">
    <td >${b.project_id}</td>
    <td>${b.project_name}</td>
    <td>${b.project_butget}</td>
    <td>${b.project_introduce}</td>
    <td><a href="/detial?project_id=${b.project_id}">项目详情</a></td>
    </tr>
</a:forEach>
</table>

</body>
</html>
