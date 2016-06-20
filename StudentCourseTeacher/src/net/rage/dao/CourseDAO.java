package net.rage.dao;

import java.util.List;

import net.rage.entity.Course;
import net.rage.entity.Student;

public interface CourseDAO {
	
	void save(Course course);
	List<Course> getCourses();
	List<Student> getStudentList(int id);
	Course getSingleCourse(String name);
}
