package com.tenco.todo.dto;

public class JoinDTO {
	private String title;
	private int cid;
	private int tid;
	private String description;
	private int priority;
	private int completed;
	private String createAt;
	
	
	public JoinDTO(String title, int cid, int tid, String description, int priority, int completed, 
			String createAt) {
		super();
		this.title = title;
		this.cid = cid;
		this.tid = tid;
		this.description = description;
		this.priority = priority;
		this.completed = completed;
		this.createAt = createAt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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


	@Override
	public String toString() {
		return "JoinDTO [title=" + title + ", cid=" + cid + ", tid=" + tid + ", description=" + description
				+ ", priority=" + priority + ", completed=" + completed + ", createAt="
				+ createAt + "]";
	}
	
	
	
}
