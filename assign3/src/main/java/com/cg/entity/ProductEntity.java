package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	@Id
	int id;
	@Column(name = "ProductName")
	String productName;
	@Column(name = "ProductProce")
	double productPrice;
	
	
	
	public ProductEntity()
	{
		
	}
	
	
	public ProductEntity(int id, String productName, double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
