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
		<h2>JSP/JSTL, j311.jsp</h2>
		<img src="JSP.bmp"><br><h3><font color="blue">
		
		
		<c:set var="w" scope="session" value="65" />
		<c:set var="h" scope="session" value="1.62" />
		<c:set var="bmi" scope="session" value="${w/h/h }" />
		BMI: 
		<c:if test="${bmi >= 18 && bmi <=24 }">
			<c:out value="${bmi }"></c:out>
			<fmt:formatNumber value="${bmi }" maxFractionDigits="2" type="number"></fmt:formatNumber>, 標準 <br>
		</c:if>
		<c:if test="${bmi > 24 }">
			<c:out value="${bmi }"></c:out>
			<fmt:formatNumber value="${bmi }" maxFractionDigits="2" type="number"></fmt:formatNumber>, 過重 <br>
		</c:if><br>
		<c:if test="${bmi < 18 }">
			<c:out value="${bmi }"></c:out>	
			<fmt:formatNumber value="${bmi }" maxFractionDigits="2" type="number"></fmt:formatNumber>, 過輕 <br>					
		</c:if><br></font><font color="red">
		
		BMI:
		<c:choose>
			<c:when test="${bmi >= 18 && bmi <= 24 }">
				<c:out value="${bmi }"></c:out>, 標準
			</c:when>
			<c:when test="${bmi >= 24 }">
				<c:out value="${bmi }"></c:out>, 過重
			</c:when>
			<c:otherwise>
				<c:out value="${bmi }"></c:out>, 過輕
			</c:otherwise>
		</c:choose>
				
		</font></h3>
	</div>
	
	<%@ include file="footer.jsp" %>

</body>
</html>