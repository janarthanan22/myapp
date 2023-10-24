package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value="select name product_details where hsn=?",nativeQuery = true)
	public int gettaxbyhsn(int a);

}
