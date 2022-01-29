<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="<%=response.encodeURL("print.jsp") %>">link</a>
<form name"test" method="post" action = <%=response.encodeURL("print.jsp") %> >
<input type="hidden" name = "id" value="123"/>
<button name="btnSubmit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>