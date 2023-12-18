<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
	display: flex;
	align-items: center;
	justify-content: center;
	margin-top: 35px;
}
</style>
</head>
<body>
	<div class="container">
		<form action="findemployee" method="post">
		Enter the Id : <input type="text" id="id" name="id"><br>
		<br>
		<button type="submit">Find</button>
	</form>
	</div>
</body>
</html>