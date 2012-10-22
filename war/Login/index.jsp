<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" href="../css/bootstrap.css" rel="stylesheet" />
<title>ログイン画面</title>
</head>
<body class="jumbotron subhead" id="overview">
	<header class="jumbotron subhead" id="overview">
		<div class="container">
			<h1>Line</h1>
			<form method="post" action="auth" class="form-inline">
				<input type="text" name="id" class="input-medium" placeholder="id">
				<input type="password" name="password" class="input-medium" placeholder="password">
				<input type="submit" class="btn" value="Login"/>
			</form>
			<a href="/Member" class="btn btn-primary">Let's Register Now!!</a>
		</div>
	</header>
</body>
</html>
