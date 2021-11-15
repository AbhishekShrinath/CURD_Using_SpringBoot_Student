<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data Save</title>
</head>
<body>
<h2>Student Update Data</h2>
<Form action="updatedata" method="get">
ID <input type ="number" name="id" value="${updatedata.id}" readonly><br>

Student Roll No: <input type="number" name="Student_No" value="${updatedata.student_No}" readonly><br>
Enter Student name   : <input type="text" name="Student_name" value="${updatedata.student_name}"><br>
Enter Student DOB    : <input type="date" name="Student_DOB" value="${updatedata.student_DOB}"><br>
Enter Student DOJ    : <input type="date" name="Student_DOJ" value="${updatedata.student_DOJ}"><br>
<input type="submit" value="update">
</Form>

</body>
</html>