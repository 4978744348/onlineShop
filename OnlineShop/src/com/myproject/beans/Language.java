package com.myproject.beans;

public class Language {
	
	private long id;
	private String russian;
	private String english;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRussian() {
		return russian;
	}
	public void setRussian(String russian) {
		this.russian = russian;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Language [id=" + id + ", russian=" + russian + ", english=" + english + "]";
	}
	
	

}
