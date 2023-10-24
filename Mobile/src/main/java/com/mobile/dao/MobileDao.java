package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;
import com.mobile.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;

	public List<Mobile> getDetails() {
		
		return mr.findAll();
	}

	public Mobile postAll(Mobile e) {
		
		return mr.save(e);
	}

}
