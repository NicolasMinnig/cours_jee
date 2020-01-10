package com.example.etudiants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.etudiants.data.EtudiantsDAO;

@SpringBootApplication
public class EtudiantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantsApplication.class, args);
	}

	@Bean
	public EtudiantsDAO etudiantsDAO () {
		return new EtudiantsDAO();
	}
	
}
