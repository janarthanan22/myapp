package com.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentdetails.entity.StudentDetails;
import com.studentdetails.repository.StudentDetailsRepository;

@Repository
public class StudentDetailsDao {
	@Autowired
	StudentDetailsRepository sr;

	public String setone(StudentDetails s) {
		
		 sr.save(s);
		 return "posted one successfully";
	}

	public String setAll(List<StudentDetails> s) {
		sr.saveAll(s);
		return "posted all successfully";
		
	}

	public List<StudentDetails> getAll() {
		return sr.findAll();
		
		
	}

	public StudentDetails getById(int a) {
		return sr.findById(a).get();
	}

	public String delById(int a) {
		sr.deleteById(a);
		return "deleted successfully";
	}

	public int getPercentage(int a) {
		// TODO Auto-generated method stub
		return sr.getPercentage(a);
	}

}
