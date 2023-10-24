package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.customexception.NameNotValidException;
import com.product.dao.ProductDao;
import com.product.entity.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao pd;
	
	public String setData(List<Product> a)throws NameNotValidException  {
		
		List<Product>xx=a.stream().filter(x->!x.getName().equalsIgnoreCase("laptop")).toList();
		if(xx.isEmpty()) {
			throw new NameNotValidException("plz enter proper name");
		
		}
		else {
			return pd.setData(xx);
		}
	}

	public List<Product> getall() {
		
		return pd.getall();
	}

	public List<Product> getproducts(String x) {
		List<Product> ab=getall();
		List<Product>cd=ab.stream().filter(y->y.getName().equals(x)).toList();
		return cd;
		
	}

	public List<Product> getproductsByRange(int x,int y) {
		List<Product> ab1=getall();
		List<Product>cc=ab1.stream().filter(y1->y1.getPrice()>x && y1.getPrice()<y).toList();
		return cc;
	}

	public String setOneData(Product a) throws NameNotValidException {
		
		try {
		if(a.getName().equalsIgnoreCase("laptop")) {
			throw new NameNotValidException("laptop not allowed");
		}
		else {
		
		return pd.setOneData(a);
		}
		}
		catch(NameNotValidException e) {
			return "Laptop validation failed";
		}
		
	}

	

}
