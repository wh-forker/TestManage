<%@ page language="java" import="java.util.*" import="javabean.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
      <a class="navbar-brand" class="active" href="admin.jsp">高级管理员登录</a>
    </div>
 
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        	<li class="active"><a href="AdminInfoServlet">信息管理</a></li>
            <li><a href="adminTest.jsp">考试管理</a></li>   
             <li><a href="announcement.jsp">发布通知</a></li>                  
            <li><a href="modifyAdminPw.jsp">重置密码</a></li>
            <li><a href="HelloServlet">退出</a></li>            
      </ul>      
    </div> 
  </div> 
</nav>
 
	<br> 
<center><h2><strong>修改学生信息</strong></h2>
 <input type="button" class="btn btn-primary" onclick="javascript:location.href='AdminInfoServlet'" value="返回">
	<br>	<hr>       
	<center>
	 	
	<form method="post" action="UpdateStuInfoServlet?account=${stuInfo.account}"  role="form" class="table-hover">
			<table width="30%" height="40%" border="1">
				<tr>
					<td>学号:</td>
				    <td>${stuInfo.account}</td>
				</tr>
				<tr>
					<td>姓名:</td>
					<td><input type="text" name="name"  value="${stuInfo.name}" />*</td>
				</tr>
				<tr>
					<td>性别:</td>
					<td><input type="text" name="gender"  value="${stuInfo.gender}">*</td>
				</tr>
				<tr>
					<td>专业主项</td>
					<td><input type="text" name="maincourse" value="${stuInfo.maincourse}" />*</td>
				</tr>
				<tr>
					<td>专业主项导师</td>
					<td><input type="text" name="mainteacher" value="${stuInfo.mainteacher}" />*</td>
				</tr>
			 
				<td>专业副项1</td>
				<td><input type="text" name="secondcourse"  value="${stuInfo.secondcourse}" />*</td>
				</tr>
				<tr>
					<td>副项1导师</td>
					<td><input type="text" name="secondteacher"  value="${stuInfo.secondteacher}"/>*</td>
				</tr>
				<td>专业副项2</td>
				<td><input type="text" name="secondcourse2"  value="${stuInfo.secondcourse2}" />(选填)</td>
				</tr>
				<tr>
					<td>副项2导师</td>
					<td><input type="text" name="secondteacher2"  value="${stuInfo.secondteacher2}"/>(选填)</td>
				</tr>				 
				<tr>
					<td><input type="reset"  class="btn btn-primary" value="重填" />
					</td>
					<td><input type="submit"  class="btn btn-primary" value="确定" />${message}
					</td>
				</tr>
			</table>
		</form>
		 
	</center>
	    <br><br><br><br> 
 
 	 <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>  
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
	
  </body>
</html>