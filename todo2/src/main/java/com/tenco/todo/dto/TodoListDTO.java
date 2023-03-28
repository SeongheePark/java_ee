package com.tenco.todo.dto;

public class TodoListDTO {
	private int id;
	private String title;
	private String description;
	private int priority;
	private int completed;
	private int categoryId;
	private String createAt;

	public TodoListDTO() {

	}

	

	public TodoListDTO(int id, String title, String description, int priority, int completed, int categoryId,
			String createAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.categoryId = categoryId;
		this.createAt = createAt;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		this.completed = completed;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	@Override
	public String toString() {
		return "TodoListDTO [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", completed=" + completed + ", categoryId=" + categoryId + ", createAt=" + createAt + "]";
	}

	

}
