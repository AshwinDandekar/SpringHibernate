package net.rage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.rage.dao.CourseDAO;
import net.rage.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseDAO coursedao;
	
	@Override
	@Transactional
	public List<Course> getCourses() {		
		return coursedao.getCourses();
	}

	@Override
	@Transactional
	public void saveCourse(Course c) {
		coursedao.save(c);	
	}

	@Override
	@Transactional
	public Course getSingleCourse(String name) {
		return coursedao.getSingleCourse(name);
	}


}
