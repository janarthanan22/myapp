package com.endproduct.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.endproduct.entity.EndPoint;
import com.endproduct.repository.EndPointRepository;

@Repository
public class EndPointDao {
	@Autowired
	EndPointRepository er;

	public String setall(List<EndPoint> e) {
		 er.saveAll(e);
		 return "Posted Successfully";
	}

	public List<EndPoint> getall() {
		
		return er.findAll();
	}

	public String postAll(List<EndPoint> ab) {
		er.saveAll(ab);
		return "posted all successfully";
	}

	
}
