<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/9/15
  Time: 20:52
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增账户</title>
</head>
<body>

    <form action="account/addAccount" method="post">
        账户名：<input type="text" name="accountName"><br/>
        账户金额：<input type="number" name="accountMoney"> <br/>
        <input type="submit" value="新增" />
    </form>

</body>
</html>
