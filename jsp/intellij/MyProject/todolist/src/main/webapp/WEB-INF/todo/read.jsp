<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Read</title>
</head>
<body>
    <h1>Todo Read</h1>

    ${todo}

    <table>
        <tr>
            <td>번호</td>
            <td><input type="text" name="index" value="${param.index}" readonly></td>
        </tr>
        <tr>
            <td>할일</td>
            <td><input type="text" name="todo" value="${todo.todo}" readonly></td>
        </tr>
        <tr>
            <td>기한</td>
            <td><input type="date" name="dueDate" value="${todo.dueDate}" readonly></td>
        </tr>
        <tr>
            <td>상태</td>
            <td><input type="checkbox" name="finished" ${todo.finished ? 'checked' : 'unchecked'} readonly></td>
        </tr>
    </table>

    <a href="/todo/modify?index=${param.index}">modify</a>

</body>
</html>
