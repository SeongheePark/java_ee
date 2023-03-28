package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoListDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo {
	private DBHelper dbHelper;
	private Connection conn;

	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<TodoListDTO> select() {
		ArrayList<TodoListDTO> list = new ArrayList<>();
		String strQuery = " SELECT * FROM TodoList ";
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			pStmt = conn.prepareStatement(strQuery);
			rs = pStmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				int categoryId = rs.getInt("category_id");
				String createAt = rs.getString("createdAt");
				TodoListDTO dto = new TodoListDTO(id, title, description, priority, completed, categoryId, createAt);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public int insert(String title, String description, int priority, int completed, int categoryId) {
		int resultCount = 0;
		String queryStr = " INSERT INTO TodoList(title, description, priority, completed, category_id) "
				+ "VALUES(?, ?, ?, ?, ?) ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, title);
			pStmt.setString(2, description);
			pStmt.setInt(3, priority);
			pStmt.setInt(4, completed);
			pStmt.setInt(5, categoryId);
			resultCount = pStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultCount;
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
