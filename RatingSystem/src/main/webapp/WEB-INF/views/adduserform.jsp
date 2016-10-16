<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>

<html>
<head>
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/rating.css"/>">
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>">
</head>
<body>
<h1 class ="Header" >ADD USER</h1>
<div class="container">
<div class="row clearfix">
    <div class="col-md-6 col-md-offset-3 column">
   <form action="/RatingSystem/admin/adduser" method="post">
  </br>
 <!--  <label for="inputlg">UserName</label> -->
  
 <div class="form-group">
    <label for="inputsm">UserName</label>
    <input class="form-control input-sm" name ="emailaddress" id="emailaddress"  placeholder="emailaddress">
 </div>  
    </br>
    <div class="form-group">
    <label for="inputsm">Password</label>
    <input class="form-control input-sm" type="password" name="password" placeholder="password">
  </div>
    </br>
   <input type="submit"  class="btn btn-info" value="Submit Button">
</form>
</div>
</div>
</div>
</body>
</html>