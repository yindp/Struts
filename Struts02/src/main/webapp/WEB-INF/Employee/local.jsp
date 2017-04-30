<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yindp
  Date: 4/30/17
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>I18N</title>
</head>
<body>
<s:label value="emp.id"/>
<hr>
<s:text name="emp.id"/>:<input name="id" type="text"><br>
<s:text name="emp.username"/>:<input name="username" type="text"><br>
<s:text name="emp.password"/>:<input type="password" name="password"><br>
<s:text name="emp.nickname"/>:<input name="nickname" type="text"><br>
<s:text name="emp.salary"/>:<input name="salary" type="text">
</body>
</html>
