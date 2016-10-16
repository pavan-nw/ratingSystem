<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>">
  <link type="text/css" rel="stylesheet" href="<c:url value="/styles/header.css"/>">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</head>

<h1>WELCOME ${LoggedInUser}</h1>
<h1 class ="Header" >Rating</h1>
<body>

<form action="/RatingSystem/">
<div  class="topcorner">
<button class="btn btn-success" onclick="formValidation()">Back To HomePage</button>
</div>
</form>

<form action="/RatingSystem/admin/users" name ="loginform" class="login-form">
      <button class="btn btn-success btn-lg btn-block"  onclick="formValidation()">ADD USER</button> 
</form>
</br>


<form action="/RatingSystem/admin/allusers" name ="loginform" class="login-form" method="post">
      <button class="btn btn-success btn-lg btn-block">GET ALL USERS</button> 
</form>
</br>

<form action="/RatingSystem/admin/allratings" name ="loginform" class="login-form" method="post">
      <button class="btn btn-success btn-lg btn-block">GET ALL RATINGS</button> 
</form>        
</br>

<form action="/RatingSystem/admin/avgratings" name ="loginform" class="login-form" method="post">
      <button class="btn btn-success btn-lg btn-block">GET ALL AVERAGE RATINGS</button> 
</form>
</br>

<form action="/RatingSystem/admin/ratingsbasedonuser" name ="loginform" class="login-form" method="post">
      <button class="btn btn-success btn-lg btn-block">GET RATINGS BASED ON USER NAME</button> 
</form>        
<script src="<c:url value="/scripts/bootstrap.min.js"/>"></script>
</body>
</html>


<!-- <div class="btn-toolbar" style="margin: 0;">
              <div class="btn-group">
                <button class="btn dropdown-toggle" data-toggle="dropdown">Action <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Action <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-danger dropdown-toggle" data-toggle="dropdown">Danger <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-warning dropdown-toggle" data-toggle="dropdown">Warning <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-success dropdown-toggle" data-toggle="dropdown">Success <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-info dropdown-toggle" data-toggle="dropdown">Info <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
              <div class="btn-group">
                <button class="btn btn-inverse dropdown-toggle" data-toggle="dropdown">Inverse <span class="caret"></span></button>
                <ul class="dropdown-menu">
                  <li><a href="#">Action</a></li>
                  <li><a href="#">Another action</a></li>
                  <li><a href="#">Something else here</a></li>
                  <li class="divider"></li>
                  <li><a href="#">Separated link</a></li>
                </ul>
              </div>/btn-group
            </div> -->