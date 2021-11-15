<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data Save</title>
</head>
<body>
<<h2>Student Save Data</h2>
<Form action="savedata" method="get">
Enter Student Roll No: <input type="number" name="Student_No"><br>
Enter Student name   : <input type="text" name="Student_name"><br>
Enter Student DOB    : <input type="date" name="Student_DOB"><br>
Enter Student DOJ    : <input type="date" name="Student_DOJ"><br>
<input type="submit" value="Save">
<a href="/ViewData">View All Data</a>
</Form>

</body>
</html>