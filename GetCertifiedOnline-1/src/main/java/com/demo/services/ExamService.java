package com.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Exam;

@Service
public interface ExamService {


	public List<Exam> getAllExam();

	public Exam updateExam(Exam exam);

	public String deleteExam(Exam exam);

    public void delete(int eId) throws Exception;

	public Exam addExam(Exam exam) throws Exception;

	public Exam getExamByeId(int eId) throws Exception;

	public List<Exam> getAllExams() throws Exception;

	public List<Exam> getExamByDuration(int duration) throws Exception;

	public Exam getExamByendTime(String eName);

	public List<Exam> findExamWithSorting(String eName);

	public List<Exam> sortingBasedOnstartTime();

	public List<Exam> sortingBasedOnstartDate();
	
	
}
