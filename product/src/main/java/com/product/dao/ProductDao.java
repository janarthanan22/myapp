package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String setData(List<Product> a) {
		 pr.saveAll(a);
		 return "Posted all Successfully";
	}

	public List<Product> getall() {
		
		return pr.findAll();
	}

	public String setOneData(Product a) {
		
		 pr.save(a);
		 return "single Posted Successfully";
	}

	

}
