<%@ page language="java"  pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/EL, j313.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="red">
		
			7*24=${7*24 }<br><br>
		
			<%
				String	n1=request.getParameter("n1");
				String	n2=request.getParameter("n2");
				out.println(n1+" + "+n2+" = "+(Integer.parseInt(n1)+Integer.parseInt(n2)));			
			%>
			
			<br><br>
			
			${param.n1 } + ${param.n2 } =${param.n1 + param.n2 }<br><br>
			
			<%@ page isELIgnored="true" %>
				
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>