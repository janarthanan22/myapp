package com.studentmarksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmarksheet.dao.StudentMarksheetDao;
import com.studentmarksheet.entity.StudentMarksheet;

@Service
public class StudentMarksheetService {
	@Autowired
	StudentMarksheetDao md;

	public String setOne(StudentMarksheet ms) {
		int total1=ms.getSem1Praticals()+ms.getSem1Theory();
		int total2=ms.getSem2Praticals()+ms.getSem2Theory();
		
		ms.setSem1Total(total1);
		ms.setSem2Total(total2);
		
		
		return md.setOne(ms);
	}

	public String setAll(List<StudentMarksheet> ms) {
		
//		ms.stream().peek(x->x.setSem1Total(x.getSem1Theory()+x.getSem1Praticals()));
//		ms.stream().peek(x->x.setSem2Total(x.getSem2Theory()+x.getSem2Praticals()));
		ms.forEach(x->{
			
		x.setSem1Total(x.getSem1Theory()+x.getSem1Theory());
		x.setSem2Total(x.getSem2Theory()+x.getSem2Theory());
		});
		return md.setAll(ms);
	}

	public List<StudentMarksheet> getAll() {
		
		return md.getAll();
	}

	public int getMarkOne(int a) {
		
		return md.getMarkOne(a);
	}
	
public int getMarkTwo(int a) {
		
		return md.getMarkTwo(a);
	}

//public int getPercentage(int a) {
//	return md.getPercentage(a);
//}

}
