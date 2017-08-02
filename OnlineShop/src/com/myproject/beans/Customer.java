package com.myproject.beans;

public class Customer {

	private long id;
	private String login;
	private String password;
	private String contacts;
	private String status;
	private long languageId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", login=" + login + ", password=" + password + ", contacts=" + contacts
				+ ", status=" + status + ", languageId=" + languageId + "]";
	}

	
}
