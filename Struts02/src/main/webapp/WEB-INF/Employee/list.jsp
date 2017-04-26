<%--
  Created by IntelliJ IDEA.
  User: yindp
  Date: 4/25/17
  Time: 11:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>WildCard list</title>
</head>
<body>
<h1>WildCard list</h1><br>
${username}_${password}<br>
<s:property value="username"/>_<s:property value="password"/>
<br>
<s:property value="#root[1].username"/>_<s:property value="#root[1].password"/>
<hr>
${name}
<s:property value="name"/>
<hr>
${age1}<br>
<s:property value="#request.age"/>
<hr>
<s:property value="#salary"/>
<s:debug/>
</body>
</html>
