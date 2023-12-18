
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Button Styling</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
            text-align: center;
        }
        button {
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            margin: 10px;
            transition: background-color 0.3s ease;
        }
        button:hover {
            opacity: 0.8;
        }
        .create {
            background-color: #1abc9c;
            color: white;
        }
        .find {
            background-color: #3498db;
            color: white;
        }
        .update {
            background-color: #f39c12;
            color: white;
        }
        .delete {
            background-color: #e74c3c;
            color: white;
        }
    </style>
</head>
<body>
    ${msg}
    <a href="save"><button class="create">Create</button></a>
    <a href="find"> <button class="find">Find</button></a>
     <a href="findall"><button class="delete">Find All</button></a>
    <a href="update"><button class="update">Update</button></a>
    <a href="delete"><button class="delete">Delete</button></a>
    
</body>
</html>
