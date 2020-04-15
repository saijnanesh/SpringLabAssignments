package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.ProductEntity;
import com.cg.repository.ProductRepositoryInterface;

@Service
public class ProductService implements ProductServiceInterface {

	@Autowired
	ProductRepositoryInterface repoObj;
	
	@Override
	public void create(ProductEntity product) {
		boolean b=repoObj.create(product);
		if(b==true)
		{
			System.out.println("Added SucessFully");
		}
		else
		{
			System.out.println("Not Added");
		}
	}

	@Override
	public List<ProductEntity> reterive() {
		List<ProductEntity> list=repoObj.reterive();
		return list;
	}

	@Override
	public ProductEntity findById(int id) {
		ProductEntity pe=repoObj.findById(id);
		return pe;
	}

	@Override
	public void delete(int id) {
		repoObj.delete(id);
	}

	@Override
	public void update(int id, String name, double price) {
		repoObj.update(id, name, price);
	}
	
}
