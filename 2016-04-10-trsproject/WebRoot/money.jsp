<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改页面</title>
<!-- css样式 -->
<style type="text/css">
body {



	background: url("<%=basePath%>image/66.jpg") no-repeat;
}

div {


	margin: 0px auto;
	border: 1px solid gray;
	width: 500px;
	height: 350px;
	margin-top: 15%;
}

table {
	width: 500px;
	height: 350px;
	text-align: center;
	border-collapse: collapse;
}

td {
	border: 1px dashed gray;
}

tr:hover {
	background-color: red;
}

.s1 {
	color: red;
}

.s2 {
	color: blue;
}

.s3 {
	color: yellow;
}
</style>


</head>
<!-- 主体部分 -->
<body>  
	<form action="updatemoney.do" method="post">
		<div>
			<table>
			<tr>
			<td colspan="3"><h1 style="color: red;">${name}${name1}</h1></td>
			</tr>
				<tr>
					<td colspan="3" id="d1"><h2>转账操作</h2></td>
				</tr>
				<tr>
					<td>转账账号:</td>
					<td colspan="2"><input type="text" name="from" /></td>
				</tr>
				<tr>
					<td>收账账号:</td>
					<td colspan="2"><input type="text" name="to"/></td>
				</tr>
		
				<tr>
					<td>转账金额:</td>
					<td colspan="2"><input type="text" name="qian" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="重置" /></td>
					<td><input type="submit" value="转账" /></td>
				</tr>

			</table>
		</div>
	</form>

</body>
</html>