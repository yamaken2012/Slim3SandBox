<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" href="../css/bootstrap.css" rel="stylesheet" />
<style type="text/css">
input.err { background-color: pink; }
span.err  { color: red; }
</style>
<title>メンバー登録画面</title>
</head>
<body>
	<div class="container">
		<h1>Register</h1>
		<p class="lead">${f:h(message)}</p>
		<p class="lead">Let's Register!</p>
		<c:if test="${not empty errors}">
			<ul>
			<c:forEach var="e" items="${f:errors()}">
				<li><span class="err">${f:h(e)}</span></li>
			</c:forEach>
			</ul>
		</c:if>
		<form method="post" action="register" class="form-inline">
			<input type="text" ${ f:text("id") } class="input-medium ${f:errorClass('id', 'err')}" placeholder="id"/>
			<input type="password" ${ f:text("password") } class="input-medium ${f:errorClass('password', 'err')}"  placeholder="password"/>
			<input type="submit" class="btn" value="Register"/>
		</form>
		<a href="/Login" class="btn btn-primary">Back, Login page</a>
	</div>
</body>
</html>
