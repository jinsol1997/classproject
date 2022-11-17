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
  <title>Todo Register</title>
</head>
<body>

<h1>Todo Register</h1>
<form method="post">
  <table>
    <tr>
      <td>할일 </td>
      <td><input type="text" name="todo"> </td>
    </tr>
    <tr>
      <td>기한 </td>
      <td><input type="date" name="dueDate"> </td>
    </tr>
    <tr>
      <td></td>
    </tr>
  </table>

  <input type="reset" value="초기화"><input type="submit" value="등록">
</form>

</body>
</html>
