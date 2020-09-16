<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/9/16
  Time: 14:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>修改账户余额</title>
</head>
<body>

    <form method="post" action="${pageContext.request.contextPath}/account/update">
        <table>
            <tr>
                <td>账户名</td>
                <td>
                    <input type="hidden" name="accountId" value="${account.accountId}">
                    <input type="text" name="accountName" value="${account.accountName}">
                </td>
            </tr>
            <tr>
                <td>账户余额</td>
                <td>
                    <input type="number" name="accountMoney" value="${account.accountMoney}">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="修改"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
