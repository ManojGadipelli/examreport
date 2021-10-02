package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.ExamResult;

public interface ResultService {
	
	public boolean addResult(ExamResult result);
	public ExamResult getResult(String resultId);
	public ExamResult getResultByUseridAndSubject(String userid,String Subject);
	public List<ExamResult> findByName(String sname);
}
