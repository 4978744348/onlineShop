package com.myproject.beans;

import java.io.File;

public class Image {

	private long id;
	private File content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public File getContent() {
		return content;
	}

	public void setContent(File content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", content=" + content + "]";
	}

}
