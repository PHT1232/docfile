<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css">

</head>
<body>
<div class="header"><h1>Login Page</h1></div>
<div class="content">
<c:if test="${!(empty errorPage)}">
	<div class="error"><c:out value="${errorPage}"/></div>
</c:if>
<form action="RegisterServlet" method="post">
<div>
   <label for="username">Username:</label>
   <input type="text" id="username" name="userID"><br/>
   <label for="pass">Password (8 characters minimum):</label>
   <input type="password" id="pass" name="password" required><br/>
   <label for="repass">Reenter Password</label>
   <input type="password" id="repass" name="repassword" required><br/>
   <label for="firstname">FirstName:</label>
   <input type="text" id="firstname" name="firstName"><br/>
   <label for="lastname">LastName:</label>
   <input type="text" id="lastname" name="lastName"><br/>
   <label for="email">Email:</label>
   <input type="text" id="email" name="emailaddress"><br/>
   <label for="SecurityQuestion">Security Question:</label>
   <select name="question" id=SecurityQuestion>
       <option value="what is your pet name">What is your pet's name</option>
       <option value="what is your first school ">What is your first school</option>
       <option value="what is your father's name">what is your father's name </option>
       <option value="what is your mother's name">What is your mother's name</option>
   </select><br/>
   <label for="answerquestion">Answer:</label>
   <input type="text" id="answerquestion" name="answer"><br/>
   <label for="phoneNum">Phone number:</label>
   <input type="text" id="phoneNum" name="phone">
</div>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>