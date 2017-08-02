package com.myproject.beans;

import java.io.File;

public class Category {

	private long id;
	private String nameCategory;
	private String description;
	private File imageCategory;
	private String availability;
	private long languageId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public File getImageCategory() {
		return imageCategory;
	}

	public void setImageCategory(File imageCategory) {
		this.imageCategory = imageCategory;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nameCategory=" + nameCategory + ", description=" + description
				+ ", imageCategory=" + imageCategory + ", availability=" + availability + ", languageId=" + languageId
				+ "]";
	}

}
