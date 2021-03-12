<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,java.text.SimpleDateFormat" %>

<%-- Calendar SimpleDateFormatを利用して String型へ日時データを格納 --%>
<%	Calendar cl = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	String formatDate = sdf.format(cl.getTime()); %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="header clearfix">
		<div class="t_login">login</div>
		<%-- 事前に用意しておいた変数を利用して 日時を表示 簡略表示 --%>
		<div class="t_date"><%= formatDate %></div>
	</div>


<!-- </body>
</html> -->