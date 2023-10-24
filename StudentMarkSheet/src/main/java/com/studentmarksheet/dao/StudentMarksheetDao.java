package com.studentmarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmarksheet.entity.StudentMarksheet;
import com.studentmarksheet.repository.StudentMarksheetRepository;

@Repository
public class StudentMarksheetDao {
	@Autowired
	StudentMarksheetRepository md;

	public String setOne(StudentMarksheet ms) {
		// TODO Auto-generated method stub
		 md.save(ms);
		 return "post one success";
	}

	public String setAll(List<StudentMarksheet> ms) {
		md.saveAll(ms);
		return "posted all successfully";
	}

	public List<StudentMarksheet> getAll() {
		
		return md.findAll();
	}

	public int getMarkOne(int a) {
		
		return md.getMarkOne(a);
	}
public int getMarkTwo(int a) {
		
		return md.getMarkTwo(a);
	}

//public int getPercentage(int a) {
//	
//	return md.getPercentage(a);
//}

}
