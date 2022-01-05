<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style>
			#table{ 
				display: table; 
				width: 30%; 
				margin: 0 auto;
			} 
			.row{ 
				display: table-row; 
			}
			.cell{
				display: table-cell;
				padding: 3px;
			}
			.cat{
				width: 42%;
				font-weight: bold;
				text-align: right;
				padding-right: 10px;
			}
			.wrt{
				width: 58%;
				text-align: left;
				padding-left: 10px;
			}
			input[type=number]::-webkit-inner-spin-button,
		    input[type=number]::-webkit-outer-spin-button {
		        -webkit-appearance: none;             
		        margin: 0;         
		    } 
		</style>
	</head>
	<body style="text-align:center">
		<h2>Edit - ${book.title}</h2>
		<form method="post">
			<div id="table">
				<div class="row">
					<div class="cell cat">Title</div>
					<div class="cell wrt">
						<input type="text" name="title" value="${book.title}"/>
					</div>
				</div>
				<div class="row">
					<div class="cell cat">Author</div>
					<div class="cell wrt">
						<input type="text" name="author" value="${book.author}"/>
					</div>
				</div>
				<div class="row">
					<div class="cell cat">Price</div>
					<div class="cell wrt">
						<input type="number" step="0.01" name="price" value="${book.price}"/>
					</div>
				</div>
			</div>
			<div id="table" style="margin-top:10px;">
				<div class="row">
					<div class="cell"><button type="submit"><b>Submit</b></button></div>	
				</div>
			</div>
		</form>
	</body>
</html>