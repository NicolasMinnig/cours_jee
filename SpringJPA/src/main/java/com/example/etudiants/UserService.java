package com.example.etudiants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service("userservice")
public class UserService {
	@SuppressWarnings("deprecation")
	public int getAge(Person person) {
		Date date = new Date();
		Date birthDate;
		try {
			birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(person.getBirthDate());
			return date.getYear()-birthDate.getYear();
		} catch (ParseException e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}
}
