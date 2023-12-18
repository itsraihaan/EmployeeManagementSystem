<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            width: 40%;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        }
        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            border: none;
            border-radius: 3px;
            background-color: #1abc9c;
            color: white;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #16a085;
        }
        label {
            color: #2c3e50;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee Registration</h2>
        <form:form action="saveEmployee" method="post" modelAttribute="employee">
            
            <label for="id">Name:</label>
            <form:input path="id" id="id" /><br>
        
            <label for="name">Name:</label>
            <form:input path="name" id="name" /><br>
            
            <label for="email">Email:</label>
            <form:input path="email" id="email" /><br>
            
            <label for="phno">Phone Number:</label>
            <form:input path="phno" id="phno" /><br>
            
            <label for="age">Age:</label>
            <form:input path="age" id="age" /><br>
            
            <label for="gender">Gender:</label>
            <form:input path="gender" id="gender" /><br>
            
            <label for="role">Role:</label>
            <form:input path="role" id="role" /><br>
            
            <input type="submit" value="Register">
        </form:form>
    </div>
</body>
</html>
