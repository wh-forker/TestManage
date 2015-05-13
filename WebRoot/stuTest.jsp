<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
      <a class="navbar-brand" class="active" href="student.jsp">学生登录</a>
    </div>
 
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        	<li><a href="StuQueryServlet?account=${student.account}">信息查询</a></li>
            <li class="active"><a href="StateServlet?account=${student.account}">考试登记</a></li>   
            <li><a href="modifyStuPw.jsp">重置密码</a></li>
            <li><a href="HelloServlet">退出</a></li>            
      </ul>      
    </div> 
  </div> 
</nav>
	
	 <br>
	 <br>
	<center><h2><strong>考试登记</strong></h2><br>
  		您当前的状态为: ${sstate}<br><br>
   	<center>
	 	
	<form method="post" action="StuTestServlet?account=${student.account}"  role="form" class="table-hover" >
			<table border="1" class="t" >
		 		<tr>
					<td class="p">姓名：</td>
					<td><input type="text" name="name"  value=""  size="50"/></td>
				</tr>	
				<tr>
					<td class="p">专业：</td>
					<td><input type="text" name="professional"  value=""  size="50"/></td>
				</tr>
					
				<tr>
					<td class="p">课程名：</td>
					<td><input type="text" name="course"  value=""  size="50"/></td>
				</tr>
				<tr>
					<td class="p">学期：</td>
					<td><input type="text" name="term"  value=""  size="50"/></td>
				</tr>	
				<tr>
					<td class="p">作品名称：</td>
					<td><input type="text" name="workname"  value=""  size="50"/></td>
				</tr>
				
				<tr>
					<td class="p">作曲家：</td>
					<td><input type="text" name="composer"  value=""  size="50"></td>
				</tr>
				
				<tr>
					<td class="p">课堂类别：</td>
					<td><input type="text" name="type" value=""  size="50"></td>
				</tr>
				<tr>
					<td class="p"><input type="reset"  class="btn btn-primary" value="重填" />					</td>
					<td><input type="submit"  class="btn btn-primary" value="确定" />&nbsp;&nbsp;&nbsp; ${message}		</td>
				</tr>
				(课堂类别填：集体课或个人课)
			</table>
		</form>
	</center>
	<br><br><br><br> 
 
  <script src="js/jquery-1.8.1.min.js"></script>  
  <script src="js/bootstrap.min.js"></script>
    
  </body>
</html>




                        