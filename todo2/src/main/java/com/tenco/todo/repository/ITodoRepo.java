package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.JoinDTO;
import com.tenco.todo.dto.TodoListDTO;

public interface ITodoRepo {
	ArrayList<JoinDTO> select();
	int insert(String title, String description, int priority, int completed, int category_id);
	int update(int id, String title);
	int delete(int id);
}
