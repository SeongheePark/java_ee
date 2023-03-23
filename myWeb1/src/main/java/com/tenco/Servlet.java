package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// http://localhost:8080/myWeb1/Servlet
		request.getContentType();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=utf-8");
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<header>");
		out.print("</header>");
		out.print("<body>");
		out.print("<h1>");
		out.print("Test용 글입니다 ~!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
