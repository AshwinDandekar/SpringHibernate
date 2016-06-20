package net.rage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.rage.dao.TeacherDAO;
import net.rage.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherDAO teacherdao;
	
	@Override
	@Transactional
	public List<Teacher> findAllTeachers() {
		return teacherdao.getTeachers();
	}
	
	@Override
	@Transactional
	public void saveTeacher(Teacher teach) {
		teacherdao.saveTeacher(teach);
		
	}

}
