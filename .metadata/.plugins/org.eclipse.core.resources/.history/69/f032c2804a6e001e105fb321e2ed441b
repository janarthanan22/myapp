package com.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao md;

	public List<Mobile> getDetails() {
		// TODO Auto-generated method stub
		return md.getDetails();
	}

	public Mobile postAll(Mobile e) {
		
		return md.postAll(e);
	}

}
