package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.ExamResult;
import com.example.demo.service.ResultService;

@RestController
@RequestMapping("/api/rest")
@CrossOrigin(origins="http://localhost:4200")
public class MyRestController {
	@Autowired
	ResultService rService;
	
	

//	@GetMapping("/examResult/{resultId}")
//	public ExamResult getExamResult(@PathVariable(name="resultId") String resultId) {
//		return rService.getResult(resultId);	
	
	
	
	@GetMapping("/examResult")
	public ExamResult getExamResult() {
		return  rService.getResult("res3");
		
	}
	@PostMapping("/examResult")
	public boolean addExamResult(@RequestBody ExamResult eresult) {
		return rService.addResult(eresult);
		
	}
	
	@GetMapping("/searchByname/{snamefromangular}")
	public List<ExamResult> getstudentsfindByName(@PathVariable(name="snamefromangular") String sname){
		return rService.getstudentsfindByName(sname);}
}
