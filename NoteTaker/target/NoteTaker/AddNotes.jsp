<%@page import="com.rays.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="library.jsp"%>
<title>Add Notes</title>
</head>
<body>
	<div class="container-fluid m-0 p-0">
	
		<%@include file="navbar.jsp" %>
		<h1> Please Fill Your Note Details</h1>
		<br>
		<!-- This is our form -->
		<form action="<%=ORSView.NOTE_CTL%>" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title"
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter Dteails"> 
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea required="required" name="content" placeholder="Enter content" id="content" class="form-control" style="height: 200px"></textarea>
			</div>
			
<div class="container text-center" >
			<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>