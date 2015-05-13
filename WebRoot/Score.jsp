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
					<li class="active"><a href="teachClassServlet">课程考试</a>
					</li>
					<li><a href="GetTestRejServlet">报名审核</a>
					</li>
					<li><a href="modifyTeachPw.jsp">重置密码</a>
					</li>
					<li><a href="HelloServlet">退出</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
 
	<br> 
<center><h2><strong>评分</strong></h2>
    
	<center>
	 	
	<form method="post" action="UpdateStuScoreServlet?account=${stuScore.account }&term=${stuScore.term}"  role="form" class="table-hover">
			<table width="30%" height="40%" border="1">
				<tr>
					<td>学号</td>
				    <td>${stuScore.account}</td>
				</tr>
				<tr>
					<td>学期</td>
					<td>${stuScore.term}</td>
				</tr>
				<tr>
					<td class="alert alert-info" role="alert" >专业主项</td>
					<td><input type="text" name="maincourse" value="${stuScore.maincourse}" />*</td>
				</tr>
    			<tr>
					<td>课堂类别</td>
					<td><input type="text" name="type1" value="${stuScore.type1}" />*</td>
				</tr>
				<tr>
					<td>平时成绩</td>
					<td><input type="text" name="usualperformance" value="${stuScore.usualperformance}" />*</td>
				</tr>
			 	<tr>
					<td>期中作品</td>
					<td><input type="text" name="midwork" value="${stuScore.midwork}" />*</td>
				</tr>
				<tr>
					<td>期中成绩</td>
					<td><input type="text" name="quiz"  value="${stuScore.quiz}" />*</td>
				</tr>
			    <tr>
			 		<td>期末作品</td>
					<td><input type="text" name="finalwork" value="${stuScore.finalwork}" />*</td>
				</tr>
				<tr>
					<td>期末成绩</td>
					<td><input type="text" name="finalgrade"  value="${stuScore.finalgrade}" />*</td>
				</tr>
				 <tr>
					<td>总评成绩</td>
					<td><input type="text" name="grade"  value="${stuScore.grade}" />*</td>
				</tr>
						
				<tr>
					<td class="alert alert-info" role="alert" >专业副项1</td>
					<td><input type="text" name="secondcourse" value="${stuScore.secondcourse}" />*</td>
				</tr>
				<tr>
					<td>课堂类别</td>
					<td><input type="text" name="type2" value="${stuScore.type2}" />*</td>
				</tr>
				<tr>
					<td>平时成绩</td>
					<td><input type="text" name="usualperformance2" value="${stuScore.usualperformance2}" />*</td>
				</tr>
			 	<tr>
					<td>期中作品</td>
					<td><input type="text" name="midwork2" value="${stuScore.midwork2}" />*</td>
				</tr>
				<tr>
					<td>期中成绩</td>
					<td><input type="text" name="quiz2"  value="${stuScore.quiz2}" />*</td>
				</tr>
			    <tr>
			 		<td>期末作品</td>
					<td><input type="text" name="finalwork2" value="${stuScore.finalwork2}" />*</td>
				</tr>
				<tr>
					<td>期末成绩</td>
					<td><input type="text" name="finalgrade2"  value="${stuScore.finalgrade2}" />*</td>
				</tr>
				 <tr>
					<td>总评成绩</td>
					<td><input type="text" name="grade2"  value="${stuScore.grade2}" />*</td>
				</tr>
				
				<tr>
					<td class="alert alert-info" role="alert" >专业副项2</td>
					<td><input type="text" name="secondcourse3" value="${stuScore.secondcourse3}" />(选填)</td>
				</tr>
				<tr>
					<td>课堂类别</td>
					<td><input type="text" name="type3" value="${stuScore.type3}" />*</td>
				</tr>
				<tr>
					<td>平时成绩</td>
					<td><input type="text" name="usualperformance3" value="${stuScore.usualperformance3}" /></td>
				</tr>
			 	<tr>
					<td>期中作品</td>
					<td><input type="text" name="midwork3" value="${stuScore.midwork3}" /></td>
				</tr>
				<tr>
					<td>期中成绩</td>
					<td><input type="text" name="quiz3"  value="${stuScore.quiz3}" /></td>
				</tr>
			    <tr>
			 		<td>期末作品</td>
					<td><input type="text" name="finalwork3" value="${stuScore.finalwork3}" /></td>
				</tr>
				<tr>
					<td>期末成绩</td>
					<td><input type="text" name="finalgrade3"  value="${stuScore.finalgrade3}" /></td>
				</tr>
				 <tr>
					<td>总评成绩</td>
					<td><input type="text" name="grade3"  value="${stuScore.grade3}" /></td>
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