package com.rays.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rays.entity.Note;
import com.rays.util.HibDataSource;

@WebServlet(name = "DeleteCtl" , urlPatterns = "/DeleteCtl")
public class DeleteCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int noteId = Integer.parseInt(req.getParameter("noteId"));
			
			Session s = HibDataSource.getSession();
			Transaction tx = s.beginTransaction();
			Note note = s.get(Note.class, noteId);
			s.delete(note);
			tx.commit();
			
			s.close();
			req.setAttribute("error", "Data Deleted Successfully....!");
			resp.sendRedirect("AllNotes.jsp");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
