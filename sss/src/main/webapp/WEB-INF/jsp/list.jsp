<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <script type="text/javascript" src="../js/jquery.min.js"></script>

    <script>
        function deleteById(resumeId){
            $.ajax({
                url: '/sss_war/user/deleteResume',
                type: 'GET',
                data: {'id':resumeId},
                contentType: 'application/json;charset=utf-8',
                dataType: 'json',
                success: function () {
                    window.location.reload();
                }
            })
        }

        function updateById(resumeId){
            window.location.href="/sss_war/user/update?id=" + resumeId;
        }

        $(function () {
            // 发送ajax请求
            $.ajax({
                url: '/sss_war/user/findList',
                type: 'GET',
                contentType: 'application/json;charset=utf-8',
                dataType: 'json',
                success: function (data) {
                    $.each(data, function (i, item) {
                        $("#resume").append("<tr attr = '" + item.id + "'><td>" + item.name + "</td>" + "<td>" +
                            item.phone + "</td>" + "<td>" + item.address + "</td><td>" +
                            "<button type=\"button\" id=\"buttonid\" onclick=\"javascript:deleteById("+ item.id +" )\">删除</button></td>" +
                            "<td><button type='button' onclick=\"javascript:updateById("+ item.id +" )\">更新</button></td></tr>");
                    })
                }
            })
        })
    </script>
</head>
<body>
    <a href="./add">添加</a>
    <table id="resume" border="1">
        <tr>
            <td id="name">姓名</td>
            <td id="phone">手机号</td>
            <td id="address">地址</td>
        </tr>
    </table>
</body>
</html>
