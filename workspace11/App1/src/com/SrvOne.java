package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvOne
 */
public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		out.println("<h1> Welcome to srvOne </h1>");
     
		ServletContext application =getServletContext();
		ServletConfig config=getServletConfig();
		
		application.setAttribute("user", "Addministrator");
		
		
		out.println("<h1> Company: "+application.getInitParameter("cname"));
		out.println("<h1> City: "+application.getInitParameter("city"));
		out.println("<h1> user: "+application.getAttribute("user"));
	}

}
