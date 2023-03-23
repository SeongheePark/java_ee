package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// JSON 형식으로 name=홍길동, age=10
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter wr = response.getWriter();
		wr.print("{\r\n"
				+ "	\"name\" : \"홍길동\",\r\n"
				+ "	\"age\" : 10\r\n"
				+ "}");

	}

	// Method : POST
	// http://localhost:8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 ?? 연산을 해서 응답처리 해보기
		// 요청 시 파라미터로 넘겨온 키 값을 확인해서 값을 추출하는 기술을 알아보자
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");

		System.out.println("name:" + name);
		System.out.println("password:" + pwd);
		
		// 응답 처리
		// MIME - text/html --> 이름과 비번을 확인하였습니다.
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("<!DOCTYPE html>");
		writer.print("<html>");
		writer.print("<header>");
		writer.print("</header>");
		writer.print("</body>");
		writer.print("아이디와 비밀번호를 확인하였습니다!");		
		writer.print("</body>");
		writer.print("</html>");
		
	
		
	}

}
