<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/student-styles.css">
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<h3>Hello username: ${username}</h3>
</div>
<div id="wrapper">
	<div><h2 id="header">Simple Student List</h2></div>
</div>
<input type="button" value="Add Student" class="add-button" onclick="window.location.href='addStudent';return false;"/>
<table style="width: 100%">
	<tr>
		<th>
			ID
		</th>
		<th>
			Name
		</th>
		<th>
			Last Name
		</th>
		<th>
			Phone
		</th>
		<th>
			Address
		</th>
		<th>
			Faculty
		</th>
		<th>
			DoB
		</th>
		<th>
			Action
		</th>
	</tr>
		<c:forEach var="tempStudent" items="${student}">
			<c:url var="updateLink" value="updateStudent">
				<c:param name="studentId" value="${tempStudent.studentnumber}"/>
			</c:url>
			
			<c:url var="deleteLink" value="deleteStudent">
				<c:param name="studentID" value="${tempStudent.studentnumber}"/>
			</c:url>
			<tr>
				<td>${tempStudent.studentnumber}</td>
				<td>${tempStudent.name}</td>
				<td>${tempStudent.lastname}</td>
				<td>${tempStudent.phone}</td>
				<td>${tempStudent.address}</td>
				<td>${tempStudent.faculty}</td>
				<td>${tempStudent.dob}</td>
				<td><a href="${updateLink}">Update</a>|
				<a href="${deleteLink}" onclick="if(!(confirm('Ban chac chan muon xoa khong?'))) return false">
					Delete
				</a>
			</tr>
		</c:forEach>
</table>
</body>
</html>