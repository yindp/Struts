<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yindp
  Date: 4/28/17
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update department</title>
</head>
<body>
<form action="Department_doUpdate" method="post">
    <%--id:<input type="texte" name="id" value="<s:property value="dept.id"/> "/><br>
    name:<input type="text" name="name" value="<s:property value="dept.name"/> "/><br>--%>
        id:<input type="texte" name="id" value="<s:property value="id"/> "/><br>
        name:<input type="text" name="name" value="<s:property value="name"/> "/><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
