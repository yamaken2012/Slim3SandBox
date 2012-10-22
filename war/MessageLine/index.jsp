<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" href="../css/bootstrap.css" rel="stylesheet" />
<script type="text/javascript" src="../js/jquery_v182.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
<title>メッセージ投稿/表示画面</title>
</head>
<body class="jumbotron subhead" id="overview">
	<a href="/Login" class="logout pull-right">Logout</a>
	<header class="jumbotron subhead" id="overview">
		<div class="container">
			<h1>Line</h1>
			<p class="lead">Hey.${f:h(userId)}! Let's Message Post!</p>
			<form method="post" action="insert" id="post-form" class="form-inline">
				<input type="text" name="message" class="span6">
			</form>
			<input type="button" value="PostMessage" id="btn-insert" class="btn btn-info"/>
			<input type="button" value="UpdateMessage" id="btn-update" class="btn btn-success"/>
			<input type="button" value="DeleteMessage" id="btn-delete" class="btn btn-danger"/>
		</div>
	</header>

	<div style="padding-top: 10px;" class="contents">		
		<form method="post" action="update" id="show-form" class="form-inline">
			<table>
			<c:forEach var="e" items="${messageList}">
				<tr>
					<input type="hidden" name="keyArray" value="${f:h(e.key)}">
					<td><input type="checkbox" name="checkBoxArray" value="${f:h(e.key)}"/></td>
					<td><input type="text" name="messageArray" value="${f:h(e.message)}"></td>
					<td>${f:h(e.createDate)}</td>
				</tr>
			</c:forEach>
			</table>
		</form>
	</div>
</body>
</html>
