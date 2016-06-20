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
<div id="fullscreen_bg" class="fullscreen_bg"/>
<div class="container">
<form class="form-signin" method="POST" action="/StudentCourseTeacher/mainpage">
  <div class="form-group">
    <label for="user">User:</label>
    <input type="text" class="form-control" id="user" name="user">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="pwd">
    <input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
  </div>
  <button type="submit" class="btn btn-primary btn-md">Submit</button>
</form>
</div>
</body>
</html>
