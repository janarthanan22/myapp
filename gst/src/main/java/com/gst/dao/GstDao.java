package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {
	@Autowired 
	GstRepository gr;

	public String setAll(List<Gst> s) {
		 gr.saveAll(s);
		 return "posted all successfully";
	}

	public int getTaxByHsn(int x) {
		
		return gr.getTaxByHsn(x);
	}

	public int getDisByHsn(int x) {
		
		return gr.getDisByHsn(x);
	}

//	public int getTaxByHsn(int x) {
//		return gr.getTaxByHsn(x);
//	}

}
