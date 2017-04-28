<%--
  Created by IntelliJ IDEA.
  User: yindp
  Date: 4/26/17
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts taglib</title>
</head>
<body>
<s:if test="#salary<1800">
    salary less 1800.
</s:if>
<s:elseif test="#salary>1800&& #salary<3000">
    Salary is between 1800 and 3000.
</s:elseif>
<s:else>
    Salary is more than 3000.
</s:else>
</body>
</html>
