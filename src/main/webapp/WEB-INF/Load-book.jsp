<%--
  Created by IntelliJ IDEA.
  User: moiup
  Date: 27.11.2025
  Time: 21:42
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>File Upload TMS Example Servlet - Java web application</title>
</head>
<body>
<div>
  <h3> Choose File to Upload in Server </h3>
  <form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="upload"/>
  </form>
</div>
</body>
</html>
