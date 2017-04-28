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
<hr
<%--when we user iterator, the emp of emps is saved in CompoundRot--%>

<s:iterator value="#emps" var="emp">
            <s:property value="id"/>_<s:property value="userName"/>_<s:property value="password"/>_<s:property
        value="nickName"/>_
<s:property value="salary"/><br>
</s:iterator>
<hr>
<%--    when we use var, emp of emps is saved in ActionContext--%>
<s:iterator value="#emps" var="emp" status="st">
    <div
            <s:if test="#st.odd">
                style="background: cadetblue"
            </s:if>>
        <s:property value="#emp.id"/>_<s:property value="#emp.userName"/>_<s:property
            value="#emp.password"/>_<s:property
            value="#emp.nickName"/>_<s:property value="#emp.salary"/>_<s:property value="#st.odd"/>_<s:property
            value="#st.index"/>_<s:property value="#st.count"/>_<s:property value="#st.last"/> <br>
    </div>
</s:iterator>

</body>
</html>
