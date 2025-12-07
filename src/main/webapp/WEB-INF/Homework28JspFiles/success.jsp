<%--
  Created by IntelliJ IDEA.
  User: moiup
  Date: 07.12.2025
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Заявка сохранена</title>
</head>
<body>
<h2>Заявка успешно сохранена</h2>

<p><strong>Имя:</strong> <%= request.getAttribute("name") %></p>
<p><strong>Email:</strong> <%= request.getAttribute("email") %></p>
<p><strong>Сообщение:</strong> <%= request.getAttribute("message") %></p>

</body>
</html>
