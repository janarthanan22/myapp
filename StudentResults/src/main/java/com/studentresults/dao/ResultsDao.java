package com.studentresults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentresults.entity.Results;
import com.studentresults.repository.ResultsRepository;

@Repository
public class ResultsDao {
	@Autowired
	ResultsRepository rr;

	public String setone(Results s) {
		 rr.save(s);
		 return "posted one";
	}

	public String setAll(List<Results> s) {
		 rr.saveAll(s);
		 return "posted all";
	}

	public Results getById(int a) {
		return rr.findById(a).get();
	}

	public String delById(int a) {
		 rr.deleteById(a);
		 return "deleted successfully";
	}

	public List<Results> getAll() {
		return rr.findAll();
	}

}
