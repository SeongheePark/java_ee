package com.tenco;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myServlet2")
public class myServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public myServlet2() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "include 연습하는 중 ~";
		request.setAttribute("msg2", message);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index2.jsp");
		dispatcher.include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
