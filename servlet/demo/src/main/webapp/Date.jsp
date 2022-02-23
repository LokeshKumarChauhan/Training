<html>
<head>
<title>Example of JSP Implicit Object</title>
 <%@ page import="java.util.Date" %>
 </head>
<body bgcolor=#ffffff>
<font color="Black">
<h2> This example gives the Current Date </h2>
<h3>
 <% response.setHeader("Refresh", "6"); %>
 Current date: <%= new Date() %>.
</h3>
</body>
</html>