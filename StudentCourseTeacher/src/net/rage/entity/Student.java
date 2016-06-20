package net.rage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
@NamedQueries({@NamedQuery(name="GET_ALL_STUDENTS",query="select s from Student s"),
	@NamedQuery(name="GET_SCORE",query="select cs.score from StudentCourseAssoc cs inner join Student s on s.seq_id=cs.studentId.seq_id where cs.studentId.seq_id = :studid and cs.courseId.seq_id =:cid")})
public class Student {

	@Id
	@Column(name="seq_id" , insertable = false, nullable = false, unique = true)
	private int seq_id;
	
	@Column(name="student_name")
	private String student_name;
	
	@Column(name="inactive_ind")
	private String inactive_ind;
	
	
	public int getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(int seq_id) {
		this.seq_id = seq_id;
	}
	
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	
	public String getInactive_ind() {
		return inactive_ind;
	}
	
	public void setInactive_ind(String inactive_ind) {
		this.inactive_ind = inactive_ind;
	}
	
	
}
