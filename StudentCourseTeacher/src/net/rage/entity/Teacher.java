package net.rage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
@NamedQuery(name="GET_ALL_TEACHERS",query="select t from Teacher t")
public class Teacher {
	
	@Id
	@Column(name="seq_id" , unique=true, nullable=false, insertable=false)
	private int seq_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="inactive_ind")
	private String inactive_ind;	
	
	public int getSeq_id() {
		return seq_id;
	}
	
	public void setSeq_id(int seq_id) {
		this.seq_id = seq_id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInactive_ind() {
		return inactive_ind;
	}
	
	public void setInactive_ind(String inactive_ind) {
		this.inactive_ind = inactive_ind;
	}
	
}
