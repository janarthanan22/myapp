package com.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentdetails.entity.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

	@Query(value="select attendance from student where roll_number=? ",nativeQuery = true)
	public int getPercentage(int a);

}
