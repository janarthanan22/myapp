package com.product;

import org.junit.Test;

import com.product.controller.ProductController;

public class GetAll {
	ProductController pc=new ProductController();
	@Test
	public void testGet() {
		pc.getall();
	}

}
