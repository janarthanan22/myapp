package com.myjavaapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaApps {
	
	@GetMapping("/get")
	public String getname() {
		return "This is Jana";
	}

}
