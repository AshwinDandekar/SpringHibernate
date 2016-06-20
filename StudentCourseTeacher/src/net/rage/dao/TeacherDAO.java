package net.rage.dao;

import java.util.List;
import net.rage.entity.Teacher;

public interface TeacherDAO {
	
	List<Teacher> getTeachers();
	void saveTeacher(Teacher teach);
}
