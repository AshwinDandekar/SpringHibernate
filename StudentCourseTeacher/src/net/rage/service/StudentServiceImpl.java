package net.rage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.rage.dao.StudentDAO;
import net.rage.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDAO studentdao;
	
	@Override
	@Transactional
	public List<Student> findAllStudents() {
		return studentdao.getAllStudents();
	}

	@Override
	@Transactional
	public int getStudentScore(int sid, int cid) {
		return studentdao.getStudentScore(sid, cid);
	}

	@Override
	@Transactional
	public void saveStudent(Student stud) {
		studentdao.saveStudent(stud);
		
	}

}
