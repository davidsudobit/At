package com.JavaAllAtOnce;

import java.time.LocalDateTime;

public class Product implements Comparable<Product>{
	
	private Long productId;
	
	private String productName;
	
	private Double productPrice;
	
	private LocalDateTime productMfdDate;
	
	private LocalDateTime lastModified;
	
	public Product() {
		super();
	}

	public Product(Long productId, String productName, Double productPrice, LocalDateTime productMfdDate, LocalDateTime lastModified) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMfdDate = productMfdDate;
		this.lastModified=lastModified;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDateTime getProductMfdDate() {
		return productMfdDate;
	}

	public void setProductMfdDate(LocalDateTime productMfdDate) {
		this.productMfdDate = productMfdDate;
	}

	public LocalDateTime getLastModified() {
		return lastModified;
	}

	public void setLastModified(LocalDateTime lastModified) {
		this.lastModified = lastModified;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productMfdDate=" + productMfdDate + ", lastModified=" + lastModified + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.productId.compareTo(o.productId);
	}

}
