package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.JoinDTO;
import com.tenco.todo.dto.TodoListDTO;
import com.tenco.todo.repository.TodoDAO;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoTest() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TodoDAO dao = new TodoDAO();
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
		} else {
			ArrayList<JoinDTO> resultList = dao.select();
			request.setAttribute("list", resultList);
			// System.out.println(resultList.toString());
			RequestDispatcher dispatcher = request.getRequestDispatcher("test/todoList.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String priority = request.getParameter("priority");
		String completed = request.getParameter("completed");
		String categoryId = request.getParameter("categoryId");

		TodoDAO todoDAO = new TodoDAO();

		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("insert")) {
			responseCount = todoDAO.insert(title, description, Integer.parseInt(priority), Integer.parseInt(completed),
					Integer.parseInt(categoryId));
		} else if (action.equals("update")) {
			String id = request.getParameter("id");
			responseCount = todoDAO.update(Integer.parseInt(id), title);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인: " + responseCount);
	}

}
