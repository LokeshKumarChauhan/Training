<html>
<head>
<title> JSP Expressions </title>
</head>
<body bgColor="white">
<h2>Simple JSP Expression</h2>
<ul>
<li> Session id:<%= session.getId() %>
<li> Creation time:<%= new 
java.util.Date(session.getCreationTime()) %>
<li> Time of last access: " + <%= new 
java.util.Date(session.getLastAccessedTime())%>
</ul>
</body>
</html>