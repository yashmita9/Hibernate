<%@page import="com.rays.entity.Note"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.rays.util.HibDataSource"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page: Notes Toker</title>
<%@include file="library.jsp"%>
</head>
<body>
	<div class="container-fluid">

		<%@include file="navbar.jsp"%>
		<h1>Update Page</h1>
		<%
			int noteId = Integer.parseInt(request.getParameter("noteId"));

			Session s = HibDataSource.getSession();
			Transaction tx = s.beginTransaction();
			Note note = s.get(Note.class, noteId);
		%>

		<form action="UpdateCtl" method="post">
			<div class="form-group">
				<label for="title">Note Title</label> <input name="title" value="<%=note.getTitle() %>"
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter Dteails">
			</div>
			<div class="form-group">
				<label for="content">Note Content</label>
				<textarea required="required" name="content"
					placeholder="Enter content" id="content" class="form-control"
					style="height: 200px" ><%=note.getContent() %></textarea>
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Save</button>
			</div>
		</form>
	</div>

</body>
</html>