package com.studentdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdetails.customexception.AgeNotValidException;
import com.studentdetails.dao.StudentDetailsDao;
import com.studentdetails.entity.StudentDetails;

@Service
public class StudentDetailsService {
	@Autowired
	StudentDetailsDao sd;

	public String setone(StudentDetails s)throws AgeNotValidException {
		if(s.getAge()>18) {
		return sd.setone(s);
	}
		else {
			throw new AgeNotValidException("age must be greater than 18");
		}
			
		}

	public String setAll(List<StudentDetails> s)throws AgeNotValidException {
		List<StudentDetails>aa=s.stream().filter(x->x.getAge()<18).toList();
		if(aa.isEmpty()) {
			return sd.setAll(s);
		}
		
		else {
		
		throw new AgeNotValidException("age must be greater than 18");
		}
	}
	
	
	
	
//	List<Product>xx=a.stream().filter(x->!x.getName().equalsIgnoreCase("laptop")).toList();
//	if(xx.isEmpty()) {
//		throw new NameNotValidException("plz enter proper name");
//	
//	}
//	else {
//		return pd.setData(xx);
//	}

	public List<StudentDetails> getAll() {
		return sd.getAll();
	}

	public StudentDetails getById(int a) {
		return sd.getById(a);
	}

	public String delById(int a) {
		
		return sd.delById(a);
	}

	public int getPercentage(int a) {
		// TODO Auto-generated method stub
		return sd.getPercentage(a);
	}

}
