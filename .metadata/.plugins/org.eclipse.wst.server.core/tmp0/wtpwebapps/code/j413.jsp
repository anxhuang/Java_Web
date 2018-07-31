<%@ page language="java"  pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*, java.util.*, java.sql.*" %>
<%@ page import="javax.servlet.*" import="javax.servlet.http.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/javaBean, j413.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		<jsp:useBean id="fruit1" class="code.util.Fruit" scope="request"> <%-- !!Must Require: id, class, scope !! --%>
			<jsp:setProperty name="fruit1" property="title" param="title" /> <%-- param="get the param name send by GET" --%>
		</jsp:useBean>
		1, I like <jsp:getProperty property="title" name="fruit1" /><br><br>
		
		<jsp:useBean id="fruit2" class="code.util.Fruit" scope="request">
			<jsp:setProperty name="fruit2" property="title" param="*" /> <%-- param="*" return null --%>
		</jsp:useBean>
		2, I like <jsp:getProperty property="title" name="fruit2" /><br><br>

		<jsp:useBean id="fruit3" class="code.util.Fruit" scope="request">
			<jsp:setProperty name="fruit3" property="title" /> <%-- no param setting => get from class.util.Fruit --%>
		</jsp:useBean>
		3, I like <jsp:getProperty property="title" name="fruit3" /><br><br>

		<jsp:useBean id="fruit4" class="code.util.Fruit" scope="request">
			<jsp:setProperty name="fruit4" property="*" /> <%-- setProperty property="*" is fine --%>
		</jsp:useBean>
		4, I like <jsp:getProperty property="title" name="fruit4" /><br><br>

		<jsp:useBean id="fruit5" type="code.util.Fruit" class="code.util.Fruit" scope="request">
			<jsp:setProperty name="fruit5" property="*" /> <%-- type="" have no effect --%>
		</jsp:useBean>
		5, I like <jsp:getProperty property="title" name="fruit5" /><br><br>
										
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>