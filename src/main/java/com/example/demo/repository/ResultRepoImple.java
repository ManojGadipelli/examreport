package com.example.demo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.ExamResult;

@Repository
public class ResultRepoImple implements ResultRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addResult(ExamResult result) {
		eMan.persist(result);
		return true;
	}

	@Override
	public ExamResult getResult(String resultId) {
		ExamResult obj=eMan.find(ExamResult.class, resultId);
		return obj;
	}

	

	

}
