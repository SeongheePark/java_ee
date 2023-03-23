package com.tenco;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.dao.Dao;

@WebServlet("/sv")
public class sv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Dao dao;

	public sv() {
		dao = new Dao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		if("type".equals("Join")) {
			int result = dao.save(name, password);
			if(result != 0) {
				System.out.println("저장 성공!");						
		} 
			}else if ("type".equals("SignOut")) {
				dao.delete(name, password);
				System.out.println("삭제 성공!");
		}
	}

}
