package com.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Exam;
import com.demo.repository.ExamRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class ExamServiceImpl implements ExamService{
 
	@Autowired
	ExamRepository examRepository;

	@Override
	public List<Exam> getAllExam() {
		// TODO Auto-generated method stub
		return  null;
	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteExam(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int eId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Exam addExam(Exam exams) throws Exception {
		// TODO Auto-generated method stub
		  return exams;
	}

	@Override
	public List<Exam> getAllExams() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam getExamByeId(int eId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> getExamByDuration(int duration) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Exam getExamByendTime(String eName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Exam> findExamWithSorting(String eName) {
		// TODO Auto-generated method stub
		return null;
		/* List<Exam> matchingExams = new ArrayList<>();

	        // Find exams with matching name
	        for (Exam exam : exams) {
	            if (exam.geteName().equals(eName)) {
	                matchingExams.add(exam);
	            }
	        }

	        // Sort exams based on start time
	        Collections.sort(matchingExams, new Comparator<Exam>() {
	            @Override
	            public int compare(Exam exam1, Exam exam2) {
	                return exam1.getStartTime().compareTo(exam2.getStartTime());
	            }
	        });

	        return matchingExams;
	    }*/}
	
	

	@Override
	public List<Exam> sortingBasedOnstartTime() {
		return null;
		// TODO Auto-generated method stub
		/* List<Exam> sortedExams = new ArrayList<>(exams);

	        Collections.sort(sortedExams, new Comparator<Exam>() {
	            @Override
	            public int compare(Exam exam1, Exam exam2) {
	                return exam1.getStartTime().compareTo(exam2.getStartTime());
	            }
	        });

	        return sortedExams;
	    }*/
	}
	

	@Override
	public List<Exam> sortingBasedOnstartDate() {
		return null;
		// TODO Auto-generated method stub
		/*List<Exam> exams = new ArrayList<>(this.exams.values()));

        // Sort the exams based on the start date using a custom comparator
        Collections.sort(exams, new Comparator<Exam>() {
            @Override
            public int compare(Exam exam1, Exam exam2) {
                return exam1.getExamDate().compareTo(exam2.getExamDate());
            }
        });

        return exams;
   
	}*/
	
}
	
}	

