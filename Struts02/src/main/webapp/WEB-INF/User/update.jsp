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
    <title>Update User</title>
</head>
<body>
<s:form acceptcharset="User_update" method="POST">
    <s:textfield label="id" name="id"/>
    <s:textfield label="username" name="username"/>
    <%--<s:checkboxlist label="hobby" name="hobbies"
                    list="#{'read':'read','sport':'sport','music':'music','money':'money'}" listKey="key" listValue="value"></s:checkboxlist>
    <s:radio label="gender" name="gender" list="#{'0':'male','1':'female'}"/>--%>
    <s:select list="#departments" label="Department" listKey="id" listValue="name" headerKey="-1" headerValue="Department"/>
    <s:submit value="Submit"/>
</s:form>
</body>
</html>
