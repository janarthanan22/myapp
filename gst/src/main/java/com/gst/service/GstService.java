package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {
	@Autowired
	GstDao gd;

	public String setAll(List<Gst> s) {
		return gd.setAll(s);
	}

	public int getTaxByHsn(int x) {
		
		return gd.getTaxByHsn(x);
	}

	public int getDisByHsn(int x) {
		return gd.getDisByHsn(x);
	}

//	public int getTaxByHsn(int x) {
//		
//		return gd.getTaxByHsn(x);
//	}

}
