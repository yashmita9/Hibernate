package com.rays.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rays.entity.Note;
import com.rays.util.HibDataSource;

@WebServlet(name = "NotesCtl", urlPatterns = {"/NotesCtl"})
public class NotesCtl extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			Session session = HibDataSource.getSession();
			Transaction tx = session.beginTransaction();
			session.save(note);
			tx.commit();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1 style='text-align:center;'> Note is added successfully</h1>");
			out.println("<h1 style='text-align:center;'> <a href='AllNotes.jsp'>View All Notes </a></h1>");
			
		
		}catch(Exception e) {
			
		}
		
	}

}
