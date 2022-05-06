<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="False" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Controller</title>
</head>
<body>
	<h1>this is help</h1>
	<%-- <%
	  String name = (String)request.getAttribute("name");
	  Integer id = (Integer)request.getAttribute("id");
	%>
	 --%>
	<h1>Name is 
	<%--  <%=name %> --%>
	 ${name} </h1>
	<h1>Id is
	<%-- <%=id %> --%>
	 ${id} </h1>
	 <hr>
	 
	 
	 
	 <c:forEach var="item" items = "${marks}">
	 	<h1>${item} </h1>
	 
	 </c:forEach>
</body>
</html>