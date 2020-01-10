package com.example.produit;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProduitController {
	
	@Autowired
	ProduitDao produitDao;
	
	@GetMapping("/")
	public String accueil(Map<String, Object> model) {
		model.put("page", "Home");
		return "accueil";
	}
	
	@GetMapping("/basic")
	public String basic(Map<String, Object> model) {
		model.put("page", "Products");
		model.put("products", produitDao.getAllProducts());
		return "basic";
	}
	
	@GetMapping("/form")
	public String form(Map<String, Object> model) {
		model.put("product", new Produit());
		model.put("page", "Form");
		return "formulaire";
	}
	
	@PostMapping("/product")
	public String saveEtudiant(@Valid @ModelAttribute Produit produit, BindingResult errors, Model model) {
		
		
		if (!errors.hasErrors()) {
            produitDao.save(produit);
            
            
        }
        return ((errors.hasErrors()) ? "produit" : "redirect:basic");
	}

}
