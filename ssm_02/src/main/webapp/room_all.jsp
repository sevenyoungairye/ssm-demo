<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/12/21
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>客房信息</title>

    <script src="js/jquery.min.js" type="text/javascript"></script>
</head>
<body>

    <h3 style="text-align: center">客房信息</h3>

    <table border="1" cellpadding="0" cellspacing="0" align="center" width="800px" style="height: 150px">
        <tr>
            <td colspan="5" style="text-align: right">
                <a href="javascript: add();">新增客房</a>
            </td>
        </tr>

        <tr>
            <td>房号</td>
            <td>客房类型</td>
            <td>入住状态</td>
            <td>价格</td>
            <td>操作</td>
        </tr>

        <tbody id="tbody">

            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>

        </tbody>

    </table>


    <script>

        function load_all() {
            $.ajax({
                url: 'room/all',
                type: 'get',
                dataType: 'json',
                success: res => {
                    console.log(res)

                    let table_info = '';

                    for (let i = 0; i < res.length; i++) {

                        let roomStatus = res[i].roomStatus == 0 ? '未入住' : '已经入住';

                        let roomType = res[i].roomType == 1 ? '单间' : (res[i].roomType == 2 ? '标间' : '套间');

                        table_info +=
                            "<tr>" +
                            "    <td>" + res[i].roomNo + "</td>" +
                            "    <td>" + roomType + "</td>" +
                            "    <td>" + roomStatus + "</td>" +
                            "    <td>" + res[i].price + "</td>" +
                            "    <td>" + "<a href='javascript: upd(" + res[i].roomId + ");'>修改</a>" + "<a href='javascript: del(" + res[i].roomId + ");'>删除</a>" + "</td>" +
                            "</tr>";
                    }

                    $("#tbody tr").remove()

                    $("#tbody").append(table_info)

                },
                error: e => {
                    console.log(e)
                }
            })
        }

        function add() {
            location.href = "add.jsp";
        }

        function upd(id) {
            location.href = "room/one/" + id;
            $.ajax({

            })
        }

        function del(id) {

            if (window.confirm('确定删除吗')) {
                $.ajax({
                    url: 'room/del/' + id,
                    type: 'post',
                    success: res => {
                        if (res) {
                            load_all()
                        }
                    }

                })
            }

        }

        $(function () {
            // ready

            load_all()


        })

    </script>

</body>
</html>
