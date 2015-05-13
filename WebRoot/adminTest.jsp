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
  <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
  <style text="text/css">
    #bs-example-navbar-collapse-1{
      margin:auto;
      width:700px;
    }
  td.p{
  width:30%;
    text-align:center;
  }  
   table.t{
  width:30%;
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
            <a class="navbar-brand" class="active" href="admin.jsp">管理员登录</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        	<li><a href="AdminInfoServlet">信息管理</a></li>
            <li class="active" ><a href="AdminTestServlet">考试管理</a></li>   
             <li><a href="announcement.jsp">发布通知</a></li>                  
            <li><a href="modifyAdminPw.jsp">重置密码</a></li>
            <li><a href="HelloServlet">退出</a></li>            
      </ul>      
    </div> 
  </div> 
</nav>
   <% session.getAttribute("admin"); %>
	 <br>
	 <br>
	<center><h2><strong>考试信息发布</strong></h2><br>
   	<center>
	<form method="post" action="AdminTestRejServlet"  role="form" class="table-hover" >
			<table border="1" class="t" >
				<tr>
				 <td class="p">考试具体时间:</td>
                
               <td>  <div class="input-group date form_datetime col-md-12" data-date="2015-03-26T08:30:00Z" data-date-format="yyyy-MMdd-pHH:ii" data-link-field="dtp_input1">
                 <input class="form-control" name="testTime" size="16" type="text" readonly>
				 <span class="input-group-addon"> <span class="glyphicon glyphicon-th"></span>
                </div>  </td>
                
				</tr>
				<tr>
					<td class="p">课程学期:</td>
					<td><input type="text" name="term"  value=" "  size="50"/> </td>
				</tr>
				<tr>
					<td class="p">课程类型:</td>
					<td><input type="text" name="type"  value=" "  size="50"/> </td>
				</tr>
				<tr>
					<td class="p">考试地点:</td>
					<td><input type="text" name="place"  value=" "  size="50"/> </td>
				</tr>
				<tr>
					<td class="p">考场编号:</td>
					<td><input type="text" name="num"  value=""  size="50"> </td>
				</tr>
				
				<tr>
					<td class="p">课程：</td>
					<td><input type="text" name="course" value=" "  size="50" /></td>
				</tr>
				
				<tr>
					<td class="p">备注：</td>
					<td><input type="text" name="note" value=" "  size="50" /></td>
				</tr>
				<tr>
					<td class="p"><input type="reset"  class="btn btn-primary" value="重填" />					</td>
					<td><input type="submit"  class="btn btn-primary" value="确定" />&nbsp;&nbsp;&nbsp;${message}		</td>
				</tr>
				
			</table>
		</form>
		 
	</center>
	<br> 
	<center><h2><strong>考试信息管理</strong></h2>${dmessage }</center>
		<br>
		<table border="1" align="center" width="70%" class="table-hover">
			<tr>
				<th>考试时间</th>
				<th>课程学期</th>
				<th>课程类型</th>
				<th>考试地点</th>
				<th>考场编号</th>
				<th>课程名</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list}" var="ad">
				<tr>
					<td>${ad.testTime}</td>
					<td>${ad.term }</td>
					<td>${ad.type }</td>
					<td>${ad.place }</td>
					<td>${ad.num }</td>
					<td>${ad.course }</td>
					<td>${ad.note }</td>		 
					<td><a href="DelTestInfoServlet?place=${ad.place}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br>
	
<script type="text/javascript" src="js/jquery-1.8.3.min.js" charset="UTF-8"></script>
  <script type="text/javascript" src="js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
  <script type="text/javascript" src="js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 1
    });
	$('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });
	$('.form_time').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 1,
		minView: 0,
		maxView: 1,
		forceParse: 0
    });
</script>	    

  
  
  <script src="js/jquery-1.8.3.min.js"></script>  
  <script src="js/bootstrap.min.js"></script>  
  </body>
</html>

