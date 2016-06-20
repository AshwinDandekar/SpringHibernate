package net.rage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import net.rage.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Student> getAllStudents() {
		Query query = em.createNamedQuery("GET_ALL_STUDENTS", Student.class);
		return query.getResultList();
	}

	@Override
	public int getStudentScore(int studid,int cid) {
		Query query = em.createNamedQuery("GET_SCORE");
		query.setParameter("studid", studid);
		query.setParameter("cid", cid);
		Object score = query.getSingleResult();
		return (int)score;
	}

	@Override
	public void saveStudent(Student stud) {
		em.persist(stud);
		
	}

}
