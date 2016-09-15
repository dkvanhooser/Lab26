<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>


<%
//session.setAttribute("loggedin", "true!");
%>
<h1>Please login to continue!</h1>
       <div align="center">
        <table border="0" width="90%">
        <form:form action="login" commandName="userForm">
                <tr>
                    <td align="left" width="20%">Email: </td>
                    <td align="left" width="40%"><form:input path="username" size="30"/></td>
                    <td align="left"><form:errors path="username" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:password path="password" size="30"/></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="center"><input type="submit" value="Login"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>
