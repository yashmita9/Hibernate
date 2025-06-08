<%@page import="com.rays.entity.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.rays.util.HibDataSource"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes: Note Toker</title>
<%@include file="library.jsp"%>
</head>
<body>

	<div class="container">

		<%@include file="navbar.jsp"%>
		<br>
		<h1>ALL NOTES</h1>
		
		<div class="row">
			<div class="col-12">
				<%
					Session s = HibDataSource.getSession();
					Query q = s.createQuery("from Note");
					List<Note> list = q.list();
					for (Note note : list) {
				%>

				<div class="card mt-3 ">
					<img class="card-img-top m-4 mx-auto" src="img/icon.png"
						style="max-width: 50px" alt="Card image cap">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<div class="continer text-center">
							<a href="DeleteCtl?noteId=<%=note.getId()%>"
								class="btn btn-danger">Delete</a> <a href="UpdateView.jsp?noteId=<%=note.getId()%>"
								class="btn btn-primary">Update</a>
						</div>
					</div>
				</div>
				<%
					}
				%>
			</div>

		</div>



	</div>
</body>
</html>