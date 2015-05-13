<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="renderer" content="webkit">

<title>欢迎光临！</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<style>
.container {
	margin-top: 0px;
	width: 420px;
}
</style>
</head>

<body>
	<br>
	<br>
	<center>
		<img src="img/head.jpg"></img>
	</center>

	<div class="container">
		<form class="form-signin" action="LoginServlet" method="post" >
			
			<h2 class="form-signin-heading">音乐技能课教学考试网管系统 </h2>
			选择帐号类型：
			<input type="radio" name="identity" value="1" required> 学生 </input>
  			<input type="radio" name="identity" value="2" required> 教师 </input>
			<input type="radio" name="identity" value="0" required> 管理员</input><br><br>
			
			<label for="inputAccount" class="sr-only">帐号</label> 
			<input type="number" id="inputAccount" name="account" class="form-control"	placeholder="输入帐号" required><br>
			<label for="inputPassword" class="sr-only">密码</label>
			<input type="password" id="inputPassword" name="password" class="form-control" placeholder="输入密码" required> 
			${loginError}<br>
			<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
			<button class="btn btn-lg btn-primary btn-block" type="reset">取消</button>
		</form>
	</div><br><br>
	<center>
	<div class="alert alert-danger" role="alert">  ${Announcement.text}
	</div>
	</center>
 <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>  
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
</body>
</html>