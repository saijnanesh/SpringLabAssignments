package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.ProductEntity;
import com.cg.service.ProductServiceInterface;

@RestController
public class ProductController {

	@Autowired
	ProductServiceInterface productservice;
	
	@PostMapping("/productcreation")
	public ResponseEntity<Object> saveBook(@RequestBody ProductEntity tr) {
        productservice.create(tr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/getProductList")
    public ResponseEntity<List<ProductEntity>> getProductList() {
			List<ProductEntity> list = productservice.reterive();
			return new ResponseEntity<List<ProductEntity>>(list,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") int id)
	{
		productservice.delete(id);
		return new ResponseEntity<>("Dleted",HttpStatus.NO_CONTENT);
	}
	@GetMapping("/view/{id}")
	public ResponseEntity<ProductEntity> viewProduct(@PathVariable("id") int id)
	{
		ProductEntity tr=productservice.findById(id);
		return new ResponseEntity<ProductEntity>(tr,HttpStatus.OK);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable("id") int id,@RequestBody ProductEntity tr)
	{
		productservice.update(id,tr.getProductName(),tr.getProductPrice());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
