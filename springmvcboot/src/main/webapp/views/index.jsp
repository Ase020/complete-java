<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Spring Boot MVC</title>
</head>

<body>

<h1>This is the body section</h1>
<%--<form action="add">--%>
<%--    <input type="number" name="num1"/>--%>
<%--    <input type="number" name="num2"/>--%>
<%--    <button type="submit">Add</button>--%>
<%--</form>--%>

<form action="addAlien">
    <label>
        Enter your ID:
        <input type="number" name="id"/>
    </label>
    <label>
        Enter your name:
        <input type="text" name="name"/>
    </label>
    <label>
        Enter your age:
        <input type="number" name="age"/>
    </label>
    <button type="submit">Add</button>
</form>
</body>
</html>