package com.cg.service;

import java.util.List;

import com.cg.entity.ProductEntity;

public interface ProductServiceInterface {
	
	
	public void create(ProductEntity product);

	public List<ProductEntity> reterive();

	public ProductEntity findById(int id);

	public void delete(int id);

	public void update(int id,String name,double price);
	
	
}
