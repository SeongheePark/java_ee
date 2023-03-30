package com.tenco.todo.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.todo.dto.JoinDTO;
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
	public ArrayList<JoinDTO> select() {
		ArrayList<JoinDTO> list = new ArrayList<>();
		String strQuery = " SELECT title, c.id AS cid, t.id AS tid, description, priority, completed, createdAt FROM "
				+ "category AS c "
				+ "LEFT JOIN todoList AS t "
				+ "ON c.id = t.category_id ";
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			pStmt = conn.prepareStatement(strQuery);
			rs = pStmt.executeQuery();
			while (rs.next()) {
				String title = rs.getString("title");
				int cid = rs.getInt("cid");
				int tid = rs.getInt("tid");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				String createAt = rs.getString("createdAt");
				JoinDTO dto = new JoinDTO(title, cid, tid, description, priority, completed, createAt);
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
	public int update(int id, String title) {
		int resultCount = 0;
		String queryStr = " UPDATE todoList SET title = ? " + " WHERE id = ? ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setString(1, title);
			pStmt.setInt(2, id);
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
	public int delete(int id) {
		int resultCount = 0;
		String queryStr = " DELETE FROM TodoList " + " WHERE id = ? ";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(queryStr);
			pStmt.setInt(1, id);
			pStmt.executeUpdate();
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

}
