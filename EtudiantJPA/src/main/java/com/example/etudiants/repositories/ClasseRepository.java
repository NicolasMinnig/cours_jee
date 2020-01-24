package com.example.etudiants.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etudiants.models.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
