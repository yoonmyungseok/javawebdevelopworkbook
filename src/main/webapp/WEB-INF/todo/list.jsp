<%--
  Created by IntelliJ IDEA.
  User: yoonms0623
  Date: 25. 2. 13.
  Time: 오전 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>List Page</h1>

<ul>
  <c:forEach var="dto" items="${list}">
    <li>${dto}</li>
  </c:forEach>
</ul>

</body>
</html>
