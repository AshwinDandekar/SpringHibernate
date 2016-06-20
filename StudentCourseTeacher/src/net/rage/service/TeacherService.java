package net.rage.service;

import java.util.List;

import net.rage.entity.Teacher;

public interface TeacherService {

	public List<Teacher> findAllTeachers();
	public void saveTeacher(Teacher teach);
}
