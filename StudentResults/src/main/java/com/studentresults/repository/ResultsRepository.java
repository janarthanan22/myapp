package com.studentresults.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentresults.entity.Results;

public interface ResultsRepository extends  JpaRepository<Results, Integer>{


	

}
