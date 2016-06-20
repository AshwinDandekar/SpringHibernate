package net.rage.dao;

import java.util.List;

import net.rage.entity.Student;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	void saveStudent(Student stud);
	int getStudentScore(int studid,int cid);
}
