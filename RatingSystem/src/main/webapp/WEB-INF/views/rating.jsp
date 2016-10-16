<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/rating.css"/>">
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>">
</head>

<h3 class ="Header">WELCOME ${LoggedInUser}</h3>
<h1 class ="Header"> Please Rate Here</h1>



<form action="/RatingSystem/">
<div  class="topcorner">
<button class="btn btn-success" onclick="formValidation()">Back To HomePage</button>
</div>
</form>

<body>
<div class="col-md-4" >
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/food1.jpg"/>" alt="">
<div class="overlay">
  <h2>FOOD</h2>
  <a class="info" href="/RatingSystem/1">rate here</a>
</div>
    </div>
</div>
</div>
<div class="col-md-4">
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/transport.jpg"/>" alt="">
<div class="overlay">
  <h2>TRANSPORT</h2>
  <a class="info" href="/RatingSystem/2">rate here</a>
</div>
    </div>
</div>
</div>
<div class="col-md-4">
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/pantry.jpg"/>" alt="">
<div class="overlay">
  <h2>PANTRY</h2>
  <a class="info" href="/RatingSystem/3">rate here</a>
</div>
    </div>
</div>
<div class="col-md-4">
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/housekeeping.jpeg"/>" alt="">
<div class="overlay">
  <h2>HOUSE KEEPING</h2>
  <a class="info" href="/RatingSystem/4">rate here</a>
</div>
    </div>
</div>
</div>
<div class="col-md-4">
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/meeting.jpg"/>" alt="">
<div class="overlay">
  <h2>MEETING</h2>
  <a class="info" href="/RatingSystem/5">rate here</a>
</div>
    </div>
</div>
</div>
<div class="col-md-4">
<div class="hovereffect">
<img class="img-responsive" src="<c:url value="/images/hrservice.jpg"/>" alt="">
<div class="overlay">
  <h2>HR SERVICE</h2>
  <a class="info" href="/RatingSystem/6">rate here</a>
</div>
    </div>
</div>
</div>
</body>
</html>
