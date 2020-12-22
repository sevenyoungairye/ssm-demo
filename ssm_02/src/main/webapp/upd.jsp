<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/12/21
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>update</title>

    <script src="/js/jquery.min.js" type="text/javascript"></script>
</head>
<body>

    <form id="frm">

    <table  border="1" cellpadding="0" cellspacing="0" align="center" width="800px" style="height: 300px">
        <tr>
            <td colspan="2"><h3>修改客房信息</h3></td>
        </tr>

        <tr>
            <td>房号</td>
            <td>
                <input type="hidden" name="roomId" value="${roomInfo.roomId}">
                <input name="roomNo" value="${roomInfo.roomNo}">
            </td>
        </tr>

        <tr>
            <td>客房类型</td>
            <td>
                <select name="roomType">
                    <option value="1" ${roomInfo.roomType == 1 ? 'selected': ''}>单间</option>
                    <option value="2" ${roomInfo.roomType == 2 ? 'selected': ''}>标间</option>
                    <option value="3" ${roomInfo.roomType == 3 ? 'selected': ''}>套间</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>入住状态</td>
            <td>
                <select name="roomStatus">
                    <option value="0" ${roomInfo.roomStatus == 0 ? 'selected': ''}>未入住</option>
                    <option value="1" ${roomInfo.roomStatus == 1 ? 'selected': ''}>已经入住</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>价格</td>
            <td>
                <input type="number" name="price" value="${roomInfo.price}">
            </td>
        </tr>

        <tr>
            <td colspan="2">

                <input id="upd" type="button" value="保存">
                <input type="button" value="返回">
            </td>
        </tr>
    </table>

    </form>

    <script>

        $(function () {
            $("#upd").click(function () {
                $.ajax({
                    url: '/room/upd',
                    type: 'post',
                    data: $("#frm").serialize(),
                    success: res => {
                        if (res) {
                            location.href = "/room_all.jsp";
                        }
                    }

                })
            })

        })


    </script>

</body>
</html>
