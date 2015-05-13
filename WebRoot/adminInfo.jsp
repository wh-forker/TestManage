<%@ page language="java" import="java.util.*" import="javabean.*"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>欢迎使用！</title>
<meta name="viewport" charset="utf-8"
	content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<style text="text/css">
#bs-example-navbar-collapse-1 {
	margin: auto;
	width: 700px;
}

#accountInfo {
	margin: auto;
	width: 700px;
	margin-top: 150px;
	align: center;
}

#mytable {
	margin: auto;
	width: 400px;
}
</style>
</head>
<body>


	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" class="active" href="admin.jsp">管理员登录</a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="AdminInfoServlet">信息管理</a>
					</li>
					<li><a href="AdminTestServlet">考试管理</a>
					</li>
					<li><a href="announcement.jsp">发布通知</a>
					</li>
					<li><a href="modifyAdminPw.jsp">重置密码</a>
					</li>
					<li><a href="HelloServlet">退出</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<%
		session.getAttribute("admin");
	%>


	<center>
		<h2>
			<strong>学生信息管理</strong>
		</h2>
		<br>

		<form action="SelectStuServlet" method="post" class="form-inline"
			role="form">
			<div class="form-group">
				<label>请输入学生学号：</label> <input type="text" class="form-control"
					class="col-xs-3" name="account"> <input type="submit"
					class="btn btn-primary" value="搜索">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
					type="button" class="btn btn-primary"
					onclick="javascript:location.href='register.jsp'" value="录入学生信息">
			</div>
		</form>
	</center>
	<br>
	<hr>
	<center>
		${message }<br>
		<table border="1" align="center" width="70%" class="table-hover">
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>专业主项</th>
				<th>主项导师</th>
				<th>专业副项1</th>
				<th>副项1导师</th>
				<th>专业副项2(可空)</th>
				<th>副项2导师(可空)</th>
				<th colspan="3" style="text-align:center;">操作</th>
			</tr>
			<c:forEach items="${list}" var="ad">
				<tr>
					<td>${ad.account }</td>
					<td>${ad.name }</td>
					<td>${ad.gender }</td>
					<td>${ad.maincourse }</td>
					<td>${ad.mainteacher }</td>
					<td>${ad.secondcourse }</td>
					<td>${ad.secondteacher}</td>
					<td>${ad.secondcourse2 }</td>
					<td>${ad.secondteacher2}</td>
					<td><a href="ModifyStuInfoServlet?account=${ad.account}">修改信息</a>
					</td>
					<td><a href="ViewStuInfoServlet?account=${ad.account}">查看详情</a>
					</td>
					<td><a href="DelStuInfoServlet?account=${ad.account}">删除</a>
					</td>
				</tr>
			</c:forEach>

		</table>
		<br>
		<br>
		<br>
		<br>
	</center>

	<script src="js/jquery-1.8.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>