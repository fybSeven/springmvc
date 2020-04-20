<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>login</title>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script>
        $(function () {
            var resumeId = ${id};
            $("#resumeId").val(resumeId);
        })
    </script>
</head>

<body style="background-color:lightseagreen">
<form method="get" action="/sss_war/user/updateResume">
    <center>
        姓名：<input type="text" name="name" style="color:#999"/>
    </center>
    <center>
        手机号：<input type="text" name="phone" style="color:#999">
    </center>
    <center>
        地址：<input type="text" name="address" style="color:#999">
    </center>

    <input type="text" hidden id="resumeId" name="id" style="color:#999">
    <center>
        <input type="submit" value="提交"/>
    </center>
</form>
</body>
</html>
