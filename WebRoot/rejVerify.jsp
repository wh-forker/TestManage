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
				<a class="navbar-brand" class="active" href="teacher.jsp">老师登录</a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="teachClassServlet">课程考试</a>
					</li>
					<li class="active"><a href="GetTestRejServlet">报名审核</a>
					</li>
					<li><a href="modifyTeachPw.jsp">重置密码</a>
					</li>
					<li><a href="HelloServlet">退出</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<br><br>
	<center>
		<h2><strong>报名审核</strong>	
		</h2>(注：当前状态0表示未报名，1表示待审核，2表示审核通过)
		<br>
		<center>
			<br>${message}<br>
			<br>
			<table border="1" width="80%" class="table-hover">
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>专业</th>
					<th>课程</th>
					<th>作品名</th>
					<th>作曲家</th>
					<th>课堂类型</th>
					<th>当前状态</th>

					<th colspan="2" style="text-align:center;">操作</th>
				</tr>
				<c:forEach items="${list}" var="ad">
					<tr>
						<td><a href="TQueryServlet?account=${ad.account}"
							target="_blank">${ad.account }</a></td>
						<td>${ad.name }</td>
						<td>${ad.professional }</td>
						<td>${ad.course }</td>
						<td>${ad.workname }</td>
						<td>${ad.composer }</td>
						<td>${ad.type }</td>
						<td>${ad.state }</td>

						<td><a href="VerifyServlet?account=${ad.account}&state=2">通过</a>
						</td>
						<td><a href="VerifyServlet?account=${ad.account}&state=0">不通过</a>
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