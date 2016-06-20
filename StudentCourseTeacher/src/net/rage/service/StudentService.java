package net.rage.service;

import java.util.List;

import net.rage.entity.Student;

public interface StudentService {

	List<Student> findAllStudents();
	int getStudentScore(int sid,int cid);
	void saveStudent(Student stud);
}
