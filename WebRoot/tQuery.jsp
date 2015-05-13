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
  
	<br> 
<center><h2><strong>学生信息详情</strong></h2><br>
（注：无专业副项2的同学，那一栏显示空白或0.0属于正常现象。）
	<br>	<hr>       
	<center>
	 	
	 
		<table border="1" width="70%" class="table-hover">
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>专业主项</th>
					<th>专业主项导师</th>
					<th>专业副项1</th>
				   <th>专业副项1导师</th>
				   <th>专业副项2</th>
				   <th>专业副项2导师</th>
				</tr>
			 	<tr>					
					<td>${stuInfo.account}</td>
					<td>${stuInfo.name}</td>
					<td>${stuInfo.gender}</td>
					<td>${stuInfo.maincourse}</td>
					<td>${stuInfo.mainteacher}</td>
				    <td>${stuInfo.secondcourse}</td>
					<td>${stuInfo.secondteacher}</td>
				    <td>${stuInfo.secondcourse2}</td>
					<td>${stuInfo.secondteacher2}</td>		
				</tr>			 
			</table>
	 	
	</center>
	   <hr>
	    
	    <center>	     
		<h3> 第 1 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
			
				<td>${term1.maincourse }</td>
				<td>${term1.type1 }</td>
				<td>${term1.usualperformance}</td>
				<td>${term1.midwork}</td>
				<td>${term1.quiz}</td>
				<td>${term1.finalwork}</td>
				<td>${term1.finalgrade}</td>
				<td>${term1.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term1.secondcourse }</td>
				<td>${term1.type2 }</td>
				<td>${term1.usualperformance2}</td>
				<td>${term1.midwork2}</td>
				<td>${term1.quiz2}</td>
				<td>${term1.finalwork2}</td>
				<td>${term1.finalgrade2}</td>
				<td>${term1.grade2}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term1.secondcourse3 }</td>
				<td>${term1.type3 }</td>
				<td>${term1.usualperformance3}</td>
				<td>${term1.midwork3}</td>
				<td>${term1.quiz3}</td>
				<td>${term1.finalwork3}</td>
				<td>${term1.finalgrade3}</td>
				<td>${term1.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
	
	
	
	   <center>	     
		<h3> 第 2 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term2.maincourse }</td>
				<td>${term2.type1 }</td>
				<td>${term2.usualperformance}</td>
				<td>${term2.midwork}</td>
				<td>${term2.quiz}</td>
				<td>${term2.finalwork}</td>
				<td>${term2.finalgrade}</td>
				<td>${term2.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term2.secondcourse }</td>
				<td>${term2.type2 }</td>
				<td>${term2.usualperformance2}</td>
				<td>${term2.midwork2}</td>
				<td>${term2.quiz2}</td>
				<td>${term2.finalwork2}</td>
				<td>${term2.finalgrade2}</td>
				<td>${term2.grade2}</td>
				</td>
	
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term2.secondcourse3 }</td>
				<td>${term2.type3 }</td>
				<td>${term2.usualperformance3}</td>
				<td>${term2.midwork3}</td>
				<td>${term2.quiz3}</td>
				<td>${term2.finalwork3}</td>
				<td>${term2.finalgrade3}</td>
				<td>${term2.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
	
		    <center>	     
		<h3> 第 3 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term3.maincourse }</td>
				<td>${term3.type1 }</td>
				<td>${term3.usualperformance}</td>
				<td>${term3.midwork}</td>
				<td>${term3.quiz}</td>
				<td>${term3.finalwork}</td>
				<td>${term3.finalgrade}</td>
				<td>${term3.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term3.secondcourse }</td>
				<td>${term3.type2 }</td>
				<td>${term3.usualperformance2}</td>
				<td>${term3.midwork2}</td>
				<td>${term3.quiz2}</td>
				<td>${term3.finalwork2}</td>
				<td>${term3.finalgrade2}</td>
				<td>${term3.grade2}</td>
				</td>	
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term3.secondcourse3 }</td>
				<td>${term3.type2 }</td>
				<td>${term3.usualperformance3}</td>
				<td>${term3.midwork3}</td>
				<td>${term3.quiz3}</td>
				<td>${term3.finalwork3}</td>
				<td>${term3.finalgrade3}</td>
				<td>${term3.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
		    <center>	     
		<h3> 第 4 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
			    <td>${term4.maincourse }</td>
			    <td>${term4.type2 }</td>
				<td>${term4.usualperformance}</td>
				<td>${term4.midwork}</td>
				<td>${term4.quiz}</td>
				<td>${term4.finalwork}</td>
				<td>${term4.finalgrade}</td>
				<td>${term4.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term4.secondcourse }</td>
				<td>${term4.type2 }</td>
				<td>${term4.usualperformance2}</td>
				<td>${term4.midwork2}</td>
				<td>${term4.quiz2}</td>
				<td>${term4.finalwork2}</td>
				<td>${term4.finalgrade2}</td>
				<td>${term4.grade2}</td>
				</td>
	
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term4.secondcourse3 }</td>
				<td>${term4.type3 }</td>
				<td>${term4.usualperformance3}</td>
				<td>${term4.midwork3}</td>
				<td>${term4.quiz3}</td>
				<td>${term4.finalwork3}</td>
				<td>${term4.finalgrade3}</td>
				<td>${term4.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
	
		    <center>	     
		<h3> 第 5 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term5.maincourse }</td>
				<td>${term5.type1 }</td>
				<td>${term5.usualperformance}</td>
				<td>${term5.midwork}</td>
				<td>${term5.quiz}</td>
				<td>${term5.finalwork}</td>
				<td>${term5.finalgrade}</td>
				<td>${term5.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term5.secondcourse }</td>
				<td>${term5.type2 }</td>
				<td>${term5.usualperformance2}</td>
				<td>${term5.midwork2}</td>
				<td>${term5.quiz2}</td>
				<td>${term5.finalwork2}</td>
				<td>${term5.finalgrade2}</td>
				<td>${term5.grade2}</td>
				</td>
	
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term5.secondcourse3 }</td>
				<td>${term5.type3 }</td>
				<td>${term5.usualperformance3}</td>
				<td>${term5.midwork3}</td>
				<td>${term5.quiz3}</td>
				<td>${term5.finalwork3}</td>
				<td>${term5.finalgrade3}</td>
				<td>${term5.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
		    <center>	     
		<h3> 第 6 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
			
				<td>${term6.maincourse }</td>
				<td>${term6.type1 }</td>
				<td>${term6.usualperformance}</td>
				<td>${term6.midwork}</td>
				<td>${term6.quiz}</td>
				<td>${term6.finalwork}</td>
				<td>${term6.finalgrade}</td>
				<td>${term6.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term6.secondcourse }</td>
				<td>${term6.type2 }</td>
				<td>${term6.usualperformance2}</td>
				<td>${term6.midwork2}</td>
				<td>${term6.quiz2}</td>
				<td>${term6.finalwork2}</td>
				<td>${term6.finalgrade2}</td>
				<td>${term6.grade2}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term6.secondcourse3 }</td>
				<td>${term6.type3 }</td>
				<td>${term6.usualperformance3}</td>
				<td>${term6.midwork3}</td>
				<td>${term6.quiz3}</td>
				<td>${term6.finalwork3}</td>
				<td>${term6.finalgrade3}</td>
				<td>${term6.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
		    <center>	     
		<h3> 第 7 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
			
				<td>${term7.maincourse }</td>
				<td>${term7.type1 }</td>
				<td>${term7.usualperformance}</td>
				<td>${term7.midwork}</td>
				<td>${term7.quiz}</td>
				<td>${term7.finalwork}</td>
				<td>${term7.finalgrade}</td>
				<td>${term7.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term7.secondcourse }</td>
				<td>${term7.type2 }</td>
				<td>${term7.usualperformance2}</td>
				<td>${term7.midwork2}</td>
				<td>${term7.quiz2}</td>
				<td>${term7.finalwork2}</td>
				<td>${term7.finalgrade2}</td>
				<td>${term7.grade2}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term7.secondcourse3 }</td>
				<td>${term7.type3 }</td>
				<td>${term7.usualperformance3}</td>
				<td>${term7.midwork3}</td>
				<td>${term7.quiz3}</td>
				<td>${term7.finalwork3}</td>
				<td>${term7.finalgrade3}</td>
				<td>${term7.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
 <center>	     
		<h3> 第 8 学期</h3>   
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业主项&nbsp;&nbsp;</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
			
				<td>${term8.maincourse }</td>
				<td>${term8.type2 }</td>
				<td>${term8.usualperformance}</td>
				<td>${term8.midwork}</td>
				<td>${term8.quiz}</td>
				<td>${term8.finalwork}</td>
				<td>${term8.finalgrade}</td>
				<td>${term8.grade}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项1</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
		 
				<td>${term8.secondcourse }</td>
				<td>${term8.type2 }</td>
				<td>${term8.usualperformance2}</td>
				<td>${term8.midwork2}</td>
				<td>${term8.quiz2}</td>
				<td>${term8.finalwork2}</td>
				<td>${term8.finalgrade2}</td>
				<td>${term8.grade2}</td>
				</td>
			</tr>
	</table><br>
	<table border="1" align="center" width="70%" class="table-hover">
		<tr>
			<th>专业副项2</th>
			<th>课堂类别</th>
			<th>平时成绩</th>
			<th>期中作品</th>
			<th>期中成绩</th>
			<th>期末作品</th>
			<th>期末成绩</th>
			<th>总评</th>
		</tr>
			<tr>
				<td>${term8.secondcourse3 }</td>
				<td>${term8.type3 }</td>
				<td>${term8.usualperformance3}</td>
				<td>${term8.midwork3}</td>
				<td>${term8.quiz3}</td>
				<td>${term8.finalwork3}</td>
				<td>${term8.finalgrade3}</td>
				<td>${term8.grade3}</td>
				</td>
			</tr>
	</table>
	</center><br><hr> 
	 

	 <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>  
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
	
  </body>
</html>