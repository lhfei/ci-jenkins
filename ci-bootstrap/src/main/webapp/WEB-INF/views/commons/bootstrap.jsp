<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<%
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	String bootstrapRoot = basePath + "/resources/bootstrap/3.3.4/"; 	
	request.setAttribute("basePath", basePath);
	request.setAttribute("bootstrapRoot", bootstrapRoot);
	
	request.setAttribute("globalTitle", "Jenkins CI: The Definitive Guide.");
%>

	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="${bootstrapRoot}/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="${bootstrapRoot}/css/bootstrap-theme.min.css">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="${bootstrapRoot}/js/bootstrap.min.js"></script>	
