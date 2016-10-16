<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/style.css"/>">
</head>
<body >
<h1 class ="Header" >Rate On Move</h1>
<div class="login-page">
  <div class="form">
    <form action="/RatingSystem/login" name ="loginform" class="login-form" method="post">
     <!--  <input name ="username" id="username"  placeholder="username"/> -->
      <input name ="emailaddress" id="emailaddress"  placeholder="emailaddress"/>
      <input type="password" name="password" placeholder="password"/>
      <button onclick="formValidation()">login</button> 
    </form>
  </div>
</div>
<script src="<c:url value="/scripts/formvalidation.js"/>"></script>
</body>