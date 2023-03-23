package com.tenco.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/blog/servlet
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");

		System.out.println("name: " + name);
		System.out.println("password: " + pwd);

//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=utf-8");
		response.setContentType("text/plain; charset=utf-8;");

		// 응답...
		PrintWriter writer = response.getWriter();
		writer.write("name:" + name);
		writer.write("password:" + pwd);
	}

}
