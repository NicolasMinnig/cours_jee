package com.example.etudiants.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.etudiants.models.Classe;
import com.example.etudiants.repositories.ClasseRepository;
import com.example.etudiants.services.ClasseService;

@Controller
public class ClasseController {
	@Autowired
	ClasseRepository classeRepository;
	
	@Autowired
	ClasseService classeService;
	
	@GetMapping("/classe/form")
	public String etudiantForm(Model model) {
		model.addAttribute("classe", new Classe());
		return "classe_form";
	}

	@PostMapping("/classe/insert")
	public String insertEtudiant(@ModelAttribute Classe classe, Model model) {
		classeRepository.save(classe);
		return "etudiant_list";
	}
}
