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
<h1 class ="Header" >FOOD RATINGS</h1>
<div class="container">
<div class="row clearfix">
    <div class="col-md-6 col-md-offset-3 column">
   <form action="/RatingSystem/foodRatings" method="post">
  </br>
  <label for="inputlg">Ratings</label>
  
  <select name="rating" id="rating">
  <option >1</option>
  <option>2</option>
  <option >3</option>
  <option >4</option>
  <option >5</option>
  </select>  
    </br>
    </br>
    
    <div class="form-group">
    <!-- <label for="inputsm">comments</label>
    <input class="form-control input-sm" id="inputsm" type="text"> -->
    <label for="inputsm">Comment:</label>
      <textarea class="form-control" rows="5" name="comments" id="comments"></textarea>
  </div>
    </br>
   <input type="submit" class="btn btn-info" value="Submit Button">
</form>
</div>
</div>
</div>
</body>
</html>