package com.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {

	
	@Query(value="select tax_percentage from gst_details where hsn=?",nativeQuery = true)
	int getTaxByHsn(int x);
	@Query(value="select dis_amount from gst_details where hsn=?",nativeQuery = true)
	int getDisByHsn(int x);

	
//	@Query("select ")
//	int getTaxByHsn(int x);

}
