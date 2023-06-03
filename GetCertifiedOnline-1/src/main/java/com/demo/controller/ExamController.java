package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Exam;
import com.demo.services.ExamService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/Exam")
public class ExamController {
	
		@Autowired
		ExamService examService;
		
		
		@GetMapping("/")
		public String defaultMessage() {
			return "Welcome to Exam Page";
		}
		//http://localhost:8089/Exam/registerExam
		@PostMapping("/registerExam")
		public Exam addExam(@RequestBody Exam exam)  {
			try {
				return examService.addExam(exam);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exam;
		}
		
		@GetMapping("/allExam")
		public List<Exam> getAllExam(){
			return examService.getAllExam();
		}
		
		@PutMapping("/updateExam")
		public Exam updateExam(@RequestBody Exam exam) {
			return examService.updateExam(exam);
		}
		
		@DeleteMapping("/deleteExam")
		public String deleteExam(@RequestBody Exam exam)  {
			return examService.deleteExam(exam);
		}
		
		
	}

