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
    <h2>All Users </h2>
    <table class="table table-bordered">
    <tr>
    <th>UserId</th>
    <th>UserName</th> 
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.userId}" /></td>
            <td><c:out value="${user.userName}" /></td>
            <%-- <td><fmt:formatNumber value="${product.price}" type="currency" currencyCode="USD" /></td> --%>
        </tr>
    </c:forEach>
</table>

<form action="/RatingSystem/admin/back" name ="loginform" class="login-form">
      <button class="btn btn-info">BACK </buttossn> 
</form>
</div>
</body>
