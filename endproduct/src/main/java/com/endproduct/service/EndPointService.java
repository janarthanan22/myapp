package com.endproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endproduct.dao.EndPointDao;
import com.endproduct.entity.EndPoint;

@Service
public class EndPointService {
	@Autowired
	EndPointDao ed;

	public String setall(List<EndPoint> e) {
		return ed.setall(e);
	}

	public List<EndPoint> getall() {
		return ed.getall();
	}

	public String postAll(List<EndPoint> ab) {
		
		return ed.postAll(ab);
	}

	

}
