package com.demo.repository;

import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Exam;


@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {


	@Query("from Exam e where e.id=:id")
	public Exam getExambyeId(@Param(value="id")Integer eId );

	
	@Query("from Exam e where e.startTime=:startTime and e.endTime=:endTime")
	public Exam findExamBystartTimeEndTime(@Param(value="startTime") LocalTime startTime,@Param(value="endTime") LocalTime endTime);
	
}
	

	




