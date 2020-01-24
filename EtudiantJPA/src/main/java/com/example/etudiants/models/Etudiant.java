package com.example.etudiants.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Etudiant {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id")
	private Classe classe;
	
	public Etudiant() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	

}
