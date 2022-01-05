<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Books Store Application</title>
	</head>
	<body style="text-align:center">
			<h1>Books Management</h1>
			<h2>
				<a href="/books/new" target="ifrm1" style="margin-right:50px">Add New Book</a>
				<a href="/books/books" target="ifrm1">List All Books</a>
			</h2>
		<iframe src="/books/books" name="ifrm1" frameborder="0" width="100%" height="800px" scrolling="no">
		</iframe>
	</body>
</html>