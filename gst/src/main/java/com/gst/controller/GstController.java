package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
@CrossOrigin
public class GstController {
	@Autowired
	GstService gs;
	
	@PostMapping("/setall")
	public String setAll(@RequestBody List<Gst> s) {
		return gs.setAll(s);
	}
	
	@GetMapping("/gettaxbyhsn/{x}")
	
	public int getTaxByHsn(@PathVariable int x) {
		return gs.getTaxByHsn(x);
	}
	
@GetMapping("/getdisbyhsn/{x}")
	
	public int getDisByHsn(@PathVariable int x) {
		return gs.getDisByHsn(x);
	}
	
	


}
