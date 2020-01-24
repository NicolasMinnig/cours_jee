package com.example.etudiants.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "classe")
public class Classe {
	
	@Id
	@GeneratedValue
	private long idClasse;
	
	@Column
	private String nom;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "classe")
	private List<Etudiant> etudiants;
	
	public Classe() {

	}

	public long getId() {
		return idClasse;
	}

	public void setId(long id) {
		this.idClasse = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	

}
