package com.studentmarksheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmarksheet.entity.StudentMarksheet;

public interface StudentMarksheetRepository extends JpaRepository<StudentMarksheet, Integer> {

	
	@Query(value="select sem1total from mark_sheet where roll_number=? ",nativeQuery = true)
	int getMarkOne(int a);
	
	@Query(value="select sem2total from mark_sheet where roll_number=? ",nativeQuery = true)
	int getMarkTwo(int a);

	@Query(value="select sem2total from mark_sheet where roll_number=? ",nativeQuery = true)
	int getPercentage(int a);
	
//	@Query(value="select name product_details where hsn=?",nativeQuery = true)
//	public int gettaxbyhsn(int a);

	

}
