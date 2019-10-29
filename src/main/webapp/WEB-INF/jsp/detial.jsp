<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/28
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Project detial</title>
</head>
<body>
<a:forEach var="b" items="${id}">
    <p>项目介绍:</p>
    <p>${b.project_introduce}</p>
    <p>项目文档:</p>
    <p><a href="${b.project_file}">${b.project_file}</a></p>
    <button>下载</button>
</a:forEach>

<form method="post" action="sendMail" enctype="multipart/form-data">
        <input type="submit" value="接单" name="接单">
</form>



</body>

</html>
