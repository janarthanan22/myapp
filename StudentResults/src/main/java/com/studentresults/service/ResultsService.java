package com.studentresults.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentresults.dao.ResultsDao;
import com.studentresults.entity.Results;

@Service
public class ResultsService {
@Autowired
ResultsDao rd;

public String setone(Results s) {
	
	return rd.setone(s);
}

public String setAll(List<Results> s) {
	return rd.setAll(s);
}

public Results getById(int a) {
	
	return rd.getById(a);
}

public String delById(int a) {
	return rd.delById(a);
}

public List<Results> getAll() {
	// TODO Auto-generated method stub
	return rd.getAll();
}

public Results getTopper() {
	
	List<Results> al =getAll();
	Results ss=al.stream().max(Comparator.comparingInt(Results::getTotalMarks)).get();
	
	return ss;
}


}
