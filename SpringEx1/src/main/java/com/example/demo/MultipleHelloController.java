package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultipleHelloController {
	
	@RequestMapping("/hello")
	public String home(@RequestParam(name="name", required = false, defaultValue = "Anonymous")String name, Model model) {
//		List<String> names = new ArrayList<String>();
//		for(int i=1; i<=10;i++) {
//			list.add(name+i);
//		}
		String[] names = {"Nicolas", "Artan", "Nicolas2", "Gael", "Colin", "Julien"};
		model.addAttribute("names", names);
		return "hello";
	}

}
