<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>new lead</title>
</head>
<body>
<h2>Lead | save<h2/>
<form action="saveLead" method="post">
<pre>
First Name<input type="text" name="firstName"/>
Last Name<input type="text" name="lastName"/>

Email<input type="email" name="email"/>
Mobile<input type="number" name="mobile"/>


<input type="submit" value="Save"/>
</pre>

</form>
${msg}
</body>
</html>