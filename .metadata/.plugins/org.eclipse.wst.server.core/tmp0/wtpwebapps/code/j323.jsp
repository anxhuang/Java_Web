<%@ page language="java"  pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>
</head>
<body>

	<%@ include file="banner.jsp" %>
	
	<div align="center" id="div1">
		<h2>JSP/JSTL, j323.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		<c:forEach var="i" begin="1" end="5"> <%-- JSTL的forEach只有順向，每次+1 --%>
			<c:out value="${i }" />
		</c:forEach><br>
		
		</font><font color="red">
		<%
			for (int i=5; i >= 1; i--){
				out.print(i+" ");
			}			
		%>
		
		<br></font><font color="orange">
		<c:forTokens items="coffee,cola,7up,milk tea,巧克力布朗尼" delims="," var="i">
			<c:out value="${i }" />
		</c:forTokens><br><br>
				
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>