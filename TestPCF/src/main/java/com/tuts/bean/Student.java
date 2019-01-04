package com.tuts.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;


@NamedQueries({
	 @NamedQuery(name = "getDataById", query = "from Student where s_id=:s_id")
}
	 )

@Entity
@Table(name="Student"/*,schema="akash"*/)

public class Student {

	@Id
	@GeneratedValue(generator="system-uuid")
//	@SequenceGenerator(name="id_generator",sequenceName="id_sequence",initialValue=1)
	@GenericGenerator(name="system-uuid",strategy="uuid")
	private String s_id;
	
	@Column(name="s_name")
	private String s_name;
	
	@Column(name="s_class")
	private int s_class;
	
/*	@NotBlank
	@Column(name="s_mark")
	private double s_mark;
	
	@Column(name="s_status")
	private String s_status;
*/
	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_class() {
		return s_class;
	}

	public void setS_class(int s_class) {
		this.s_class = s_class;
	}

/*	public double getS_mark() {
		return s_mark;
	}

	public void setS_mark(double s_mark) {
		this.s_mark = s_mark;
	}

	public String getS_status() {
		return s_status;
	}

	public void setS_status(String s_status) {
		this.s_status = s_status;
	}
	*/
	
	
	
}


