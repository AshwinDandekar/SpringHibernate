<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:c="http://java.sun.com/jsp/jstl/core"
    xmlns:fn="http://java.sun.com/jsp/jstl/functions" >
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/main.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<head>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<div align="center">
<a href="https://imgflip.com/i/15tx66"><img src="https://i.imgflip.com/15tx66.jpg" title="made at imgflip.com"/></a>
</div>
<div class="container">
<div class="panel-heading">
<h3>Teachers</h3>
</div>
<table class="table" style="border-collapse: collapse;">
<thead>
<tr>
	<th>Teacher Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Status</th>
</tr>
</thead>
<tbody>
<c:forEach items="${TeachList}" var="teach">
<tr>
	<td>${teach.seq_id}</td>
	<td>${teach.name}</td>
	<td>${teach.age}</td>
	<td>${teach.inactive_ind}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div><br>
<div class="container">
<div class="panel-heading">
<h3>Courses</h3>
</div>
<table class="table" style="border-collapse: collapse;">
<thead>
<tr>
	<th>Course Id</th>
	<th>Course Name</th>
	<th>Teacher Id</th>
	<th>Credit</th>
	<th>Status</th>
</tr>
</thead>
<tbody>
<c:forEach items="${CourseList}" var="cour">
<tr>
	<td>${cour.seq_id}</td>
	<td>${cour.course_name}</td>
	<td>${cour.teacher_id}</td>
	<td>${cour.credit}</td>
	<td>${cour.inactive_ind}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div><br>
<div class="container">
<div class="panel-heading">
<h3>Students</h3>
</div>
<table class="table" style="border-collapse: collapse;">
<thead>
<tr>
	<th>Student Id</th>
	<th>Name</th>
	<th>Status</th>
</tr>
</thead>
<tbody>
<c:forEach items="${StudList}" var="stud">
<tr>
	<td>${stud.seq_id}</td>
	<td>${stud.student_name}</td>
	<td>${stud.inactive_ind}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>