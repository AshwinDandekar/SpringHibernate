package net.rage.service;

import java.util.List;

import net.rage.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	void saveCourse(Course c);
	Course getSingleCourse(String name);
}
