<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
	<div>
  		 <% Date date = new Date();
    		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			  String formatDate = sdf.format(date);%>
		<%= formatDate %>
	</div>