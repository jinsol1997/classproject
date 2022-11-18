<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Todo List</title>
    <style>
        td {
            padding: 5px;
        }
    </style>
</head>
<body>

    <h1>${title}</h1>

    <table>
        <tr>
            <th>번호</th>
            <th>할일</th>
            <th>기간</th>
            <th>완료여부</th>
        </tr>
        <c:forEach var="todo" items="${todoList}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td><a href="/todo/read?index=${todo.index}">${todo.todo}</a></td>
            <td>${todo.dueDate}</td>
            <td>${todo.finished ? '완료' : '진행중'}</td>
        </tr>
        </c:forEach>

    </table>

    <a href="/todo/register">Todo 등록</a>

</body>
</html>
