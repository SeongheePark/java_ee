package com.tenco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tenco.dto.Dto;
import com.tenco.utils.DBHelper;

public class Dao {
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Dao() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	public int save(String name, String password) {
		String query = " INSERT INTO login (name, password) " + "VALUES (?,?) ";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("save에서 오류");
			e.printStackTrace();
		}
		return result;
	}

	public void delete(String name, String password) {
		String query = " DELETE FROM login " + "WHERE name = ? AND password = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
		} catch (SQLException e) {
			System.out.println(">> delete 에러 발생 <<");
			e.printStackTrace();
		}

	}

	public Dto select(String name, String password) {
		Dto resultUser = null;
		String query = " SELECT * " + "FROM login " + "WHERE name = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Dto dto = new Dto();
				dto.setName(rs.getString("name"));
				dto.setPassword(rs.getString("password"));
				resultUser = dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultUser;
	}

	public ArrayList<Dto> select() {
		ArrayList<Dto> resultUser = new ArrayList<>();
		String query = " SELECT * " + "FROM login ";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String password = rs.getString("password");
				Dto user = new Dto(name, password);
				resultUser.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultUser;
	}

}
