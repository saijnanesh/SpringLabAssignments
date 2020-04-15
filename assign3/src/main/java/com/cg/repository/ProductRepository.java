package com.cg.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.entity.ProductEntity;

@Transactional
@Repository
public class ProductRepository implements ProductRepositoryInterface {

	
	@PersistenceContext
	EntityManager em;
	
	@Autowired
	ProductEntity entityObj;
	
	List<ProductEntity> list;
	
	
	@Override
	public boolean create(ProductEntity product) {
	if(true)
			{
				em.persist(product);
				return true;
			}
			return false;

		
		}
	

	@Override
	public List<ProductEntity> reterive() {
		String Qstr="SELECT product from ProductEntity product";
		TypedQuery<ProductEntity> query=em.createQuery(Qstr,ProductEntity.class);
		return query.getResultList();
		}

	@Override
	public ProductEntity findById(int id) {
		return em.find(ProductEntity.class, id);
	}

	@Override
	public void delete(int id) {
		em.remove(em.find(ProductEntity.class,id));
	}

	@Override
	public void update(int id, String name, double price) {
		entityObj = em.find(ProductEntity.class,id);
		entityObj.setProductName(name);
		entityObj.setProductPrice(price);
	}

		
}
