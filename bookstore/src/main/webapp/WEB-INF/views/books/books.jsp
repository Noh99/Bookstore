<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style>
			#table{ 
				display: table; 
				border-top: 3px double;
				border-left: 3px double;
				width: 70%; 
				margin: 0 auto;
			} 
			.row{ 
				display: table-row; 
			}
			.header{
				display: table-header-group;
			}
			.head{
				font-weight: bold;
			}
			.cell, .head{
				display: table-cell;
				padding: 3px;
				border-right: 3px double;
				border-bottom: 3px double;
				vertical-align: middle;
			}
		</style>
	</head>
	<body style="text-align:center">
		<h2>List of Books</h2>
		<div id="table">
			<div class="header">
				<div class="head" style="width:5%">ID</div>
				<div class="head" style="width:35%">Title</div>
				<div class="head" style="width:30%">Author</div>
				<div class="head" style="width:10%">Price</div>
				<div class="head" style="width:20%">Actions</div>
			</div>
			<c:forEach items="${books}" var="books">
				<div class="row">
					<div class="cell">${books.id}</div>
					<div class="cell">${books.title}</div>
					<div class="cell">${books.author}</div>
					<div class="cell">${books.price}</div>
					<div class="cell">
						<a href="/books/edit?id=${books.id}" style="margin-right:17px">Edit</a>
						<a href="/books/delete?id=${books.id}">Delete</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</body>
</html>