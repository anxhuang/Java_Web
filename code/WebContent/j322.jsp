<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center">

	<h2>EL, j322.jsp</h2><h3>
	
	<img alt="" src="JSP.bmp"><br><br>
	
	<%--@ page import="java.util.*" --%>
	<%--@ page import="java.util.List, java.util.ArrayList" --%>
	<%@ page import="java.util.List" import="java.util.ArrayList" %>
	
	<%//scriptlet
		List	meats=new	ArrayList();
		meats.add("雞肉"); 	//0
		meats.add("T-bone");//1
		meats.add("魚肉");	//2
		meats.add("pork");	//3
		request.setAttribute("meats", meats);
	%>
	<font color="red">
	Meats: ${meats[0] }<br>
	肉: ${meats[3] }<br><br>
	
	</font>
	<%@ page import="java.util.Map, java.util.HashMap" %>
	
	<%
		Map	drinks=new	HashMap();
		drinks.put("0","咖啡");//key-values
		drinks.put("1","milk tea");
		drinks.put("2","可樂");
		drinks.put("3","7Up");
		request.setAttribute("drinks", drinks);
	%>
	<font color="blue">
	Drinks: ${drinks["0"] }<br>
	飲料: ${drinks["3"] }<br><br>
	</font>
	
	</h3></div>
	
	<%@ include file="footer.jsp" %>
	
</body>
</html>