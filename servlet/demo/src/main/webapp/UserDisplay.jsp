<html>
<head> 
<title>Example of Implicit objects</title>
</head>
<body>
 <font face=Times New Roman size=3>
 Thank you for your submission. Your information has been
 successfully added to the database:
<br>
<br>
<%
 String sUName = request.getParameter("uname");
 String sPName = request.getParameter("pname");
%>
 User Name:<%=sUName%><br>
 Password:<%=sPName%><br>
</font>
</body>
</html>