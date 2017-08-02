package com.myproject.beans;

public class Option {

	private long id;
	private String color;
	private double weight;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Option [id=" + id + ", color=" + color + ", weight=" + weight + "]";
	}

}
