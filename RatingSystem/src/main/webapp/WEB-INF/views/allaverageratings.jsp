<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>">
<title>Home</title>
</head>
<body id="main">
<div class="container">
    <h2>All Ratings </h2>
    <table class="table table-bordered">
    <tr>
    <th>RATING ID</th>
    <th>REQUIREMENT NAME</th>
    <th>USER NAME</th>
    <th>RATINGS</th>
    <th>COMMENTS</th>
    </tr>
    <c:forEach items="${ratings}" var="rating">
        <tr>
            <td><c:out value="${rating.ratingid}" /></td>
              <td><c:out value="${rating.requirement.requirementName}" /></td> 
            <td><c:out value="${rating.user.userName}" /></td>
            <td><c:out value="${rating.rating}" /></td>
            <td><c:out value="${rating.comments}" /></td>
            <%-- <td><fmt:formatNumber value="${product.price}" type="currency" currencyCode="USD" /></td> --%>
        </tr>
    </c:forEach>
</table>

<form action="/RatingSystem/admin/back" name ="loginform" class="login-form">
      <button class="btn btn-info">BACK </buttossn> 
</form>
</div>
</body>
