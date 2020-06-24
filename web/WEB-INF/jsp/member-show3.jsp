<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
	<script type="text/javascript" src="/static/js/html5shiv.js"></script>
	<script type="text/javascript" src="/static/js/respond.min.js"></script>
	<![endif]-->
	<link rel="stylesheet" type="text/css" href="/static/css/h-ui/css/H-ui.min.css" />
	<link rel="stylesheet" type="text/css" href="/static/css/h-ui.admin/css/H-ui.admin.css" />
	<link rel="stylesheet" type="text/css" href="/static/css/Hui-iconfont/1.0.8/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="/static/css/h-ui.admin/skin/default/skin.css" id="skin" />
	<link rel="stylesheet" type="text/css" href="/static/css/h-ui.admin/css/style.css" />
	<!--[if IE 6]>
	<script type="text/javascript" src="/static/js/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>用户查看</title>
</head>
<body>



<div class="cl pd-20" style=" background-color:#5bacb6 ">
	 <img class="avatar size-XL l"  style="height: 108px;width: 200px;" src="static/h-ui/images/ucnter/0.jpg"> 

	<img  src="${pageContext.request.contextPath }/readfile" >
 </div>
<div class="pd-20">

		<table class="table table-border table-bordered table-hover table-bg table-sort">
		<tr>
		   		    <th width="50">学号</th>
					<th width="50">性别</th>
					<th width="50">电话</th>
					<th width="50">QQ</th>
					<th width="50">班级</th>
					<th width="50">入学时间</th>
		   					
		</tr>
		
		<tr>
		   <td>${key.stuxh }</td>
		   <td>${key.stusex }</td>
		   <td>${key.stutel }</td>
		   <td>${key.stuqq }</td>
		   <td>${key.stuclass }</td>
		   <td>${key.stugrade }</td>
		   
		</tr>
		
	    </table>

 <%--              <input type="hidden" name="stuid" value="${key.stuid }"/>
            学号:<input type="text" name="stuxh" value="${key.stuxh }"><br/>
            性别:<input type="text" name="stusex" value="${key.stusex }"><br/>
            手机:<input type="text" name="stutel" value="${key.stutel }"><br/>
       QQ:<input type="text" name="stuqq" value="${key.stuqq }"><br/>
             班级:<input type="text" name="stuclass" value="${key.stuclass }"><br/>
             入学时间:<input type="text" name="stugrade" value="${key.stugrade }"><br/>
  --%> 


</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> 
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
</body>
</html>