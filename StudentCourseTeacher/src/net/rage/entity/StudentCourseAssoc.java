package net.rage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="course_student_assoc")
@NamedQuery(name="GET_ALL_SCORES",query="select cs from StudentCourseAssoc cs")
public class StudentCourseAssoc {

	private int seq_id;
	private Course courseId;
	private Student studentId;
	private int score;
	private String inactive_ind;
	
	@Id
	@Column(name="seq_id", insertable=false, nullable=false, unique=true)
	public int getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(int seq_id) {
		this.seq_id = seq_id;
	}
	
	public void setCourseId(Course course) {
		this.courseId = course;
	}
	
	public void setStudentId(Student stud) {
		this.studentId = stud;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="course.seq_id")
	//@PrimaryKeyJoinColumn(name="seq_id")
	public Course getCourseId() {
		return courseId;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="teacher.seq_id")
	//@PrimaryKeyJoinColumn(name="seq_id")
	public Student getStudentId() {
		return studentId;
	}
	
	@Column(name="score")
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Column(name="inactive_ind")
	public String getInactive_ind() {
		return inactive_ind;
	}
	public void setInactive_ind(String inactive_ind) {
		this.inactive_ind = inactive_ind;
	}
	
	
}
