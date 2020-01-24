package com.example.etudiants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String first;
	
	@Column
	private String last;
	
	@Column
	private String birthDate;
	
	public Person() {
		
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public Long getId() {
		return id;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String date) {
		birthDate=date;
	}
	
	

}
