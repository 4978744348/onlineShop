package com.myproject.beans;

public class Order {
	
	private long id;
	private long productId;
	private long customerId;
	private int amountOrder;
	private double priceOrder;
	private double totalPrice;
	private String status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public int getAmountOrder() {
		return amountOrder;
	}
	public void setAmountOrder(int amountOrder) {
		this.amountOrder = amountOrder;
	}
	public double getPriceOrder() {
		return priceOrder;
	}
	public void setPriceOrder(double priceOrder) {
		this.priceOrder = priceOrder;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", productId=" + productId + ", customerId=" + customerId + ", amountOrder="
				+ amountOrder + ", priceOrder=" + priceOrder + ", totalPrice=" + totalPrice + ", status=" + status
				+ "]";
	}
	
	
	

}
