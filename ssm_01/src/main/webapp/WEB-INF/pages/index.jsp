<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/9/15
  Time: 20:49
  查询所有账户
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>查询账户</title>

    <script type="text/javascript">
        function do_upd(id) {
            location.href =
                "${pageContext.request.contextPath}/account/queryOne?accountId=" + id;
        }

        function do_del(id) {
            if (window.confirm("是否删除")) {
                location.href =
                    "${pageContext.request.contextPath}/account/delete?accountId=" + id;
            }
        }
    </script>
</head>
<body>

    <table border="1px">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>money</th>
            <th>operation</th>
        </tr>

        <tbody>
            <c:forEach items="${accountList}" var="account">
                <tr>
                    <td>${account.accountId}</td>
                    <td>${account.accountName}</td>
                    <td>${account.accountMoney}</td>
                    <td>
                        <a href="javascript:do_upd(${account.accountId});">修改</a>
                        <a href="javascript:do_del(${account.accountId});">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
