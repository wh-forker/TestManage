<%@ page language="java" import="java.util.*" import="com.ccnu.bean.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <title>欢迎使用！</title>
    <meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="renderer" content="webkit">
    
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/bootstrap-theme.min.css" rel="stylesheet">
 
    <style text="text/css">
    #bs-example-navbar-collapse-1{
      margin:auto;
      width:700px;
    }
    #accountInfo{
      margin:auto;
      width:700px;
      margin-top:150px;
       align:center;
    }
    #mytable{
      margin:auto;
      width:400px;    
    }
    </style>
    
  </head>
  <body>
  
  
  <nav class="navbar navbar-inverse" role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" class="active" href="teacher.jsp">老师登录</a>
    </div>
 
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        	<li><a href="teachClassServlet">课程考试</a></li>
        	<li ><a href="GetTestRejServlet">报名审核</a></li>   
            <li><a href="modifyTeachPw.jsp">重置密码</a></li>
            <li><a href="HelloServlet">退出</a></li>            
      </ul>      
    </div> 
  </div> 
</nav>
	 <% session.getAttribute("teacher"); %>  

	 <br><br><br><br><br>
	 <center>帐号信息</center><br>
	<table class="table table-bordered" id="mytable">
       <tr>
			<td>账号:</td>
			<td>${teacher.account}  </td>
       </tr>
		 
		<tr>
			<td>姓名:</td>
			<td>${teacher.name}</td>
		</tr>
		<tr>
			<td>性别:</td>
			<td>${teacher.gender }</td>
		</tr>
		<tr>
			<td>课程:</td>
			<td>${teacher.course }</td>
		</tr>
	</table>
	 
      <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>  
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
 
  </body>
</html>