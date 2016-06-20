package net.rage.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.NamedQueries;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedQueries({@NamedQuery(name="GET_ALL_COURSES",query="Select c from Course c"),
	@NamedQuery(name="GET_COURSE",query="Select c from Course c where c.course_name = :name"),
	@NamedQuery(name="GET_STUDENTS",query="select s.seq_id, s.student_name from Student s inner join StudentCourseAssoc cs on cs.studentId.seq_id = s.seq_id where cs.courseId.seq_id = :cid")})
@Entity
@Table(name = "Course")
public class Course {

	@Id
	@Column(name="seq_id", unique= true, nullable =false, insertable = false)
	private int seq_id;
	
	@Column(name="course_name", nullable=false)
	private String course_name;
	
	//@Column(name="teacher_id")
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="teacher_id")
	private Teacher teacherId;
	
	@Column(name="credit")
	private int credit;
	
	@Column(name="inactive_ind")
	private String inactive_ind;
	
	@OneToMany(fetch=FetchType.LAZY)
	private Set<Student> students;
	
	public int getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(int seq_id) {
		this.seq_id = seq_id;
	}
	
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Teacher getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public String getInactive_ind() {
		return inactive_ind;
	}
	
	public void setInactive_ind(String inactive_ind) {
		this.inactive_ind = inactive_ind;
	}
	
	public Set<Student> getStudents() {
		return students;
	}
}
