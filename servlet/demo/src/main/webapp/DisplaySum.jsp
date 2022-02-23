<html>
<head>
<title>JSP Example</title>
</head>
<body>
<h1>Displaying sum</h1>
<%
 int sum=0;
 for(int num=1;num<=25;num++)
 {
 sum=sum+num;
 }
 out.println("Sum of numbers from 1 to 25 is : " + sum);
%>
</body>
</html>