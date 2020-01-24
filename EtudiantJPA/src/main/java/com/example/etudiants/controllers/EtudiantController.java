package com.example.etudiants.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.etudiants.models.Etudiant;
import com.example.etudiants.repositories.EtudiantRepository;
import com.example.etudiants.services.EtudiantService;

@Controller
public class EtudiantController {
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EtudiantService etudiantService;
	
	@GetMapping(value = {"/","/all"})
	public String getAll(Map<String, Object> model) {
		model.put("etudiants", etudiantRepository.findAll());
		return "etudiant_list";
	}
	
	@GetMapping("/etudiant/form")
	public String etudiantForm(Model model) {
		model.addAttribute("etudiant", new Etudiant());
		return "etudiant_form";
	}

	@PostMapping("/etudiant/insert")
	public String insertEtudiant(@ModelAttribute Etudiant etudiant, Model model) {
		etudiantRepository.save(etudiant);
		return "etudiant_list";
	}
}
