package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@CrossOrigin
public class MobileController {
	@Autowired
	MobileService ms;
	
	@GetMapping("/getall")
	public List<Mobile> getDetails() {
		return ms.getDetails();
		
	}
	@PostMapping("/postall")
	public Mobile postAll(@RequestBody Mobile e) {
		return ms.postAll(e);
	}

}
