package net.rage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.rage.entity.Course;
import net.rage.entity.Student;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void save(Course course) {
		em.persist(course);
		
	}

	@Override
	public List<Course> getCourses() {
		Query query = em.createNamedQuery("GET_ALL_COURSES", Course.class);
		return query.getResultList();
	}

	@Override
	public List<Student> getStudentList(int id) {
		Query query = em.createNamedQuery("GET_STUDENTS",Student.class);
		query.setParameter("cid", id);
		return query.getResultList();
	}

	@Override
	public Course getSingleCourse(String name) {
		Query query = em.createNamedQuery("GET_COURSE",Course.class);
		query.setParameter("name", name);
		Object c = query.getSingleResult();
		return (Course) c;
	}

}
