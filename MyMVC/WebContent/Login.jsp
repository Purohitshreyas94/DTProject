<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Website</title>
<h3 align="center">Welcome..Please Login with your Credentials</h3>
<%@include file="Header.jsp" %>
</head>
<body>
   <form action="LoginControl" method="post">
   <table align="center">
			<thead>
				<th colspan="2">Login</th>
			</thead>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" required /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="passwd" required /></td>
			</tr>
			</tr>
			<tr>
				<td colspan="2"><center>
						<input type="submit" value="SUBMIT" />
					</center></td>
   
   
   
   
   </form>
</body>
</html>