package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerRegister
 */
@SuppressWarnings("serial")
@WebServlet("/CustomerRegister")
public class CustomerRegister extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("t1");
		String email = request.getParameter("t2");
		String pnumber = request.getParameter("t3");
		long phone = Long.parseLong(pnumber);
		
		 out.println("<html>");
		 out.println("<body bgcolor = lightgreen>");		 
		 out.println("<center>");
		 out.println(name   +"<br>");
		 out.println(email  +"<br>");
		 out.println(phone +"<br>");
		 out.println("</center></body></html>"); 
	}

}
