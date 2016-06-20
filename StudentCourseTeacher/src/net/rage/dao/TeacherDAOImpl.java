package net.rage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import net.rage.entity.Teacher;

@Repository
public class TeacherDAOImpl implements TeacherDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Teacher> getTeachers() {
		Query query = em.createNamedQuery("GET_ALL_TEACHERS",Teacher.class);
		return query.getResultList();
	}

	@Override
	public void saveTeacher(Teacher teach) {
		em.persist(teach);
	}

}
