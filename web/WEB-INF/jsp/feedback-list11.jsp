﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>班级信息</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 成绩统计分析 <span class="c-gray en">&gt;</span> 班级信息 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="80">ID</th>
					<th width="80">班级名称</th>
					<th width="120">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.classlist}" var="classlist">
				<tr class="text-c">
					<td><input type="checkbox" value="" name=""></td>
					<td>${classlist.cid}</td>
					<td>${classlist.cname}</td>
					<td class="f-14 td-manage">
						<a style="text-decoration:none" onClick="article_stop(this,'10001')" 
							href="feedback-add11.jsp" title="添加"><i class="Hui-iconfont">&#xe6de;</i></a> 
							<a style="text-decoration:none" class="ml-5" onClick="article_edit('资讯编辑','article-add.html','10001')" 
							href="${pageContext.request.contextPath}/getclassbyid?cid=${classlist.cid}" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> 
							<a style="text-decoration:none" class="ml-5" onClick="article_del(this,'10001')" 
							href="${pageContext.request.contextPath}/deleteclass?cid=${classlist.cid}" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
</body>
</html>