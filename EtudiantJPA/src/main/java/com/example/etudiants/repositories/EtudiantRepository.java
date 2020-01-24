package com.example.etudiants.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etudiants.models.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
