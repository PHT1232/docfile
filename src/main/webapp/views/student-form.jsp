<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
<div class="header"><h1>Register student</h1></div>
<div class="content">
<form action="saveStudent" method="post">
<div>
   <label for="username">Student ID:</label>
   <input type="text" id="studentId" name="studentnumber"><br/>
   <label for="pass">Name:</label>
   <input type="text" id="name" name="name" required><br/>
   <label for="repass">Last name:</label>
   <input type="text" id="lastName" name="lastname" required><br/>
   <label for="Date of birth">Date of birth:</label>
   <input type="text" id="firstname" name="dob"><br/>
   <label for="email">address:</label>
   <input type="text" id="email" name="address"><br/>
   <label for="lastname">Phone number:</label>
   <input type="text" id="phoneNumber" name="phoneNumber"><br/>
   <label for="Faculty">Faculty:</label>
   <input type="text" id="Faculty" name="faculty">
</div>
<input type="submit" value="Register">
</form>
</div>
</body>
</html>