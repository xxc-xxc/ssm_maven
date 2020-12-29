<%--
  Created by IntelliJ IDEA.
  User: jinj
  Date: 2020/12/29
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <table width="100%" border="1">
        <tr>
            <th>id</th>
            <th>名称</th>
        </tr>
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
        </tr>
    </table>
</body>
</html>
