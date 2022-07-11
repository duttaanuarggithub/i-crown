<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update lead</title>
</head>
<body>
<h2>Lead | update<h2/>
<form action="updateLead" method="post">
<pre>
First Name<input type="text" name="firstName" value="${lead.firstName }"/>
Last Name<input type="text" name="lastName"  value="${lead.lastName }"/>

Email<input type="email" name="email"  value="${lead.email }"/>
Mobile<input type="number" name="mobile"  value="${lead.mobile }"/>


<input type="submit" value="Update"/>
</pre>

</form>
${msg}
</body>
</html>