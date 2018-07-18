<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>j121</title>
</head>
<body>

	<h2>JSP, j121</h2>

	<img alt="" src="JSP.bmp"><br>
	
	<%-- 1, JSP comment --%>
	
	<%-- 2, JSP declaration --%>
	<%! 
		String	name="Anderson";
		double	W=60;
		double	H=1.62;
		char	G='M';		
	
	%>
	
	<h3>
	
	姓名: <%= name %><br><%-- 3, JSP expression --%>
	體重: <% out.print(W); %><br><%-- 4, JSP scriplet --%>
	身高: <%=H %><br>
	性別: <% out.print(G); %><br><br>

	<%-- JSP 5, directive --%>
	<%@ page import="java.util.Date" %>
	<%! Date	d=new	Date(); %>
	
	Today is <%= d %><br>
	今天是 <% out.print(d); %><br><br>

	</h3>
</body>
</html>