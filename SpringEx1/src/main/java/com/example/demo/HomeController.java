package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(@RequestParam(name="name", required = false, defaultValue = "Anonymous")String name, Model model) {
		model.addAttribute("name", name);
		return "home";
	}

}
