package com.example.demo.jparepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.ExamResult;

public interface MyjpaRepo extends JpaRepository<ExamResult,String> {
	public List<ExamResult> findByName(String sname);

}
