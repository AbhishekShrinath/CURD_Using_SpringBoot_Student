<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All</title>
</head>
<body>
	<h2>List Of Students</h2>
	<Form action="search" method="get">
		Enter ID <input type="number" name="searchid" value="${updatedata.id}" required="required">
		<input type="submit" value="search"> <label>${msg}</label>
	</Form>
	<form action="ViewData" method="get">

		<table border='1'>

			<tr>
				<th>ID</th>
				<th>Student RollNo.</th>
				<th>Student Name</th>
				<th>Student Data OF birth</th>
				<th>Student Data of Joining</th>
				<th>Delete</th>
				<th>Update</th>

			</tr>
			<c:forEach items="${data}" var="data">
				<tr>
					<td>${data.id}</td>
					<td>${data.student_No}</td>
					<td>${data.student_name}</td>
					<td>${data.student_DOB}</td>
					<td>${data.student_DOJ}</td>
					<td><a href="delete?id=${data.id}">delete</a></td>
					<td><a href="update?id=${data.id}">Update</a></td>

				</tr>
			</c:forEach>

		</table>
	</form>
</body>
</html>