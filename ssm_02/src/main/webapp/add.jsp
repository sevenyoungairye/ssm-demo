<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/12/21
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>


<form id="frm">

    <table  border="1" cellpadding="0" cellspacing="0" align="center" width="800px" style="height: 300px">
    <tr>
        <td colspan="2"><h3>修改客房信息</h3></td>
    </tr>

    <tr>
        <td>房号</td>
        <td><input name="roomNo" value=""></td>
    </tr>

    <tr>
        <td>客房类型</td>
        <td>
            <select name="roomType">
                <option value="1">单间</option>
                <option value="2">标间</option>
                <option value="3">套间</option>
            </select>
        </td>
    </tr>

    <tr>
        <td>入住状态</td>
        <td>
            <select name="roomStatus">
                <option value="0">未入住</option>
                <option value="1">已经入住</option>
            </select>
        </td>
    </tr>

    <tr>
        <td>价格</td>
        <td>
            <input type="number" name="price">
        </td>
    </tr>

    <tr>
        <td colspan="2">

            <input id="add" type="button" value="保存">
            <input type="button" value="返回">
        </td>
    </tr>
</table>

</form>

<script src="js/jquery.min.js" type="text/javascript"></script>

<script>

    $(function () {
        $("#add").click(function () {
            $.ajax({
                url: '/room/add',
                type: 'post',
                data: $("#frm").serialize(),
                success: res => {
                    if (res) {
                        location.href = "./room_all.jsp";
                    }
                }

            })
        })

    })

</script>


</body>
</html>
