<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link type="text/css" href="../css/bootstrap.css" rel="stylesheet" />
<title>メッセージ表示画面</title>
</head>
<body>
	<div style="padding-bottom:20px;margin-right:20px;">
		<a href="/Logout" class="pull-right">Logout</a>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<!-- left area -->
			<div class="span5 well">
				<!-- profile area -->
				<div style="padding-bottom:1px;">
					<div style="float: left; padding-right:10px;">
						<img src="http://lorempixel.com/60/60/">
					</div>
					<div style="float: none;">
						<p><strong>${f:h(userId)}</strong></p>
						<p><a href="prof">See Profile</a></p>
					</div>
				</div>
				<hr/>
				<!-- message post area -->
				<form method="post" action="insert" id="post-form" class="form-inline">
					<input type="text" name="message" class="span5" placeholder="post message">
					<input type="submit" value="PostMessage" class="btn btn-info"/>
				</form>
				<a href="/MessageEdit">Edit post message</a>
			</div>
			
			<!-- right area -->
			<div class="span7 well">
				<!-- right area header -->
				<div>
					<h2>Message</h2>
				</div>
				<hr/>
				
				<!-- message area -->
				<c:forEach var="e" items="${messageList}">
				<div style="height:80px;">
					<div style="float: left; padding-right:10px;">
						<img src="http://lorempixel.com/60/60/">
					</div>
					<div>${f:h(e.message)}</div>
					<div class="pull-right">
						<strong>${f:h(e.userId)}</strong>
						<strong><fmt:formatDate value="${e.createDate}" pattern="yyyy/MM/dd HH:mm:ss" /></strong>
					</div>
				</div>
				<hr/>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>