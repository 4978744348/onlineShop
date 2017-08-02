package com.myproject.beans;

public class Description {
	
	private long id;
	private String nameFactory;
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameFactory() {
		return nameFactory;
	}
	public void setNameFactory(String nameFactory) {
		this.nameFactory = nameFactory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Description [id=" + id + ", nameFactory=" + nameFactory + ", description=" + description + "]";
	}
	
	

}
