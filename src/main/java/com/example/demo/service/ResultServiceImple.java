package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.jparepo.MyjpaRepo;
import com.example.demo.pojo.ExamResult;
import com.example.demo.repository.ResultRepo;


@Service
@Transactional
public class ResultServiceImple implements ResultService{
	
	@Autowired
	ResultRepo rRepo;
	
	@Autowired
	MyjpaRepo myjparepo;
	
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addResult(ExamResult result) {
		// TODO Auto-generated method stub
		
		return rRepo.addResult(result);
//		myjparepo.save(result);
//		return true;
	}

	

	@Override
	public ExamResult getResult(String resultId) {
		// TODO Auto-generated method stub
		return rRepo.getResult(resultId);
		
	}



	@Override
	public List<ExamResult> getstudentsfindByName(String sname) {
		// TODO Auto-generated method stub
		List<ExamResult> res=eMan.createQuery("from ExamResult").getResultList();
		return res;
		
	}



//	@Override
//	public ExamResult getResultByUseridAndSubject(String userid, String Subject) {
//		// TODO Auto-generated method stub
//		myjparepo.findAllById(userid);
//		return null;
//	}



//	@Override
//	public List<ExamResult> getstudentsfindByName(String sname) {
//		// TODO Auto-generated method stub
////		return myjparepo.findByName(sname);
//		List<ExamResult> res=eMan.createQuery("from ExamResult").getResultList();
//		return res;
//	}

}
