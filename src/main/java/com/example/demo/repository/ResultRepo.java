package com.example.demo.repository;

import com.example.demo.pojo.ExamResult;

public interface ResultRepo {
	
	public boolean addResult(ExamResult result);
	public ExamResult getResult(String resultId);
}
