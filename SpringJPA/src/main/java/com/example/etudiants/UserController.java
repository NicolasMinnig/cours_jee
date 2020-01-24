package com.example.etudiants;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userservice;

	@Autowired
	@GetMapping(value = {"/","/all"})
	public String getAll(Map<String, Object> model) {
		model.put("persons", userRepository.findAll());
		return "liste";
	}

	@GetMapping("/form")
	public String personForm(Model model) {
		model.addAttribute("person", new Person());
		return "person-form";
	}

	@PostMapping("/insert")
	public String insertPerson(@ModelAttribute Person person, Model model) {
		userRepository.save(person);
		return "liste";
	}
	
	@GetMapping("/detail/{id}")
	public String personDetail(@PathVariable("id") String id,Map<String, Object> model) {
		Person person = userRepository.getOne(Long.valueOf(id));
		model.put("person", person);
		model.put("age", userservice.getAge(person));
		return "details";
		
	}

}
