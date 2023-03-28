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

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repository.CategoryDAO;
import com.tenco.todo.utils.DBHelper;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// todo - DB연결 후 추후 삭제
//		DBHelper dbHelper = new DBHelper();
//		dbHelper.getConnection(); // DB연결완료
	}

	public CategoryTest() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoryDAO dao = new CategoryDAO();
		// 주소 설계
		// http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
		} else {
			
		}
		
		
		ArrayList<CategoryDTO> resultList = dao.select();
		System.out.println(resultList);

		request.setAttribute("list", resultList); // request 객체 값 셋팅
		// request. response ----> categoryList.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("test/categoryList.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// method POST 요청 시 동작!
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		CategoryDAO categoryDAO = new CategoryDAO();

		// 쿼리 파라메터 방식 데이터 받아보기
		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("update")) {
			String id = request.getParameter("id");
			responseCount = categoryDAO.update(Integer.parseInt(id), name);
		} else if (action.equals("insert")) {
			responseCount = categoryDAO.insert(name);
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("적용된 갯수 확인: " + responseCount);

	}

}
