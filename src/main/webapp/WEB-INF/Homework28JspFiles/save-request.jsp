<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Форма заявки</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            height: 100vh; /* вся высота экрана */
            display: flex;
            justify-content: center; /* горизонтальное центрирование */
            align-items: center;     /* вертикальное центрирование */
            background-color: #f9f9f9;
        }
        .container {
            text-align: center;
            background: #fff;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        form {
            width: 300px;
            margin: 0 auto;
        }
        label {
            display: block;
            margin-top: 10px;
            text-align: left;
        }
        input[type="text"], input[type="email"] {
            width: 100%;
            padding: 6px;
            margin-top: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            margin-top: 15px;
            padding: 8px 12px;
            width: 100%;
            cursor: pointer;
        }
        .error {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Введите заявку</h2>

    <form action="saveRequest" method="post">
        <label for="name">Имя:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Электронная почта:</label>
        <input type="email" id="email" name="email" required>

        <label for="message">Сообщение:</label>
        <input type="text" id="message" name="message" required>

        <input type="submit" value="Отправить заявку">
    </form>

    <%-- Если сервлет передал сообщение об ошибке --%>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
    <div class="error"><%= error %></div>
    <%
        }
    %>
</div>
</body>
</html>
