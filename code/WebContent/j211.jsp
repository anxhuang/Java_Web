<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<h2>EL, j211.jsp</h2><h3>
	
	<img alt="" src="JSP.bmp"><br><br>
	
	7+17=${7+17 }<br>
	7-17=${7-17 }<br>
	7*17=${7*17 }<br>
	7/17=${7/17 }<br>
	7 div 17=${7 div 17 }<br>
	7%17=${7%17 }<br>
	7 mod 17=${7 mod 17 }<br>
	7/0=${7/0 }<br> <%-- Infinity --%>
	7%0=Exception <%-- ${7%0 } Exception --%><br><br>
	
	<font color="blue">
	7>17: ${7>17 }<br>	
	7<=17: ${7 le 17 }<br>
	7!=17: ${7 != 17 }<br>
	7==17: ${7 eq 17 }<br><br>
	</font>
	
	<font color="red">
	true && false: ${true and false }<br>
	true and false: ${true && false }<br>
	true || false: ${true or false }<br>
	true or false: ${true || false }<br><br>
	</font>
	
	<font color="green">
	empty null= ${empty null }<br> <%-- check null is empty or not --%>
	</font>
	
	</h3>

</body>
</html>