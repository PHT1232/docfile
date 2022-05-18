<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update student</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
<div class="header"><h1>Update student</h1></div>
<div class="content">
<form action="updateStudent" method="post">
<div>
   <label for="username">Student ID:</label>
   <input type="text" id="studentId" name="studentnumber" value="${student.studentnumber}" readonly><br/>
   <label for="pass">Name:</label>
   <input type="text" id="name" name="name" value="${student.name}" required><br/>
   <label for="repass">Last name:</label>
   <input type="text" id="lastName" name="lastname" value="${student.lastname}" required><br/>
   <label for="Date of birth">Date of birth:</label>
   <input type="text" id="firstname" name="dob" value="${student.dob}"><br/>
   <label for="email">address:</label>
   <input type="text" id="email" name="address" value="${student.address}"><br/>
   <label for="lastname">Phone number:</label>
   <input type="text" id="phoneNumber" name="phoneNumber" value="${student.phone}"><br/>
   <label for="Faculty">Faculty:</label>
   <input type="text" id="Faculty" name="faculty" value="${student.faculty}">
</div>
<input type="submit" value="Update">
</form>
</div>
</body>
</html>